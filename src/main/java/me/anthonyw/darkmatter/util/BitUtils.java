package me.anthonyw.darkmatter.util;

import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class BitUtils {
	
	private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
	private static final int ROW_BYTES = 16;
	private static final int ROW_QTR1 = 3;
	private static final int ROW_HALF = 7;
	private static final int ROW_QTR2 = 11;
	
	private BitUtils() {}
	
	/**
	 * Convert an array of bytes to a hex string.
	 * 
	 * @param bytes
	 * @return
	 */
	public static String bytesToHex(byte[] bytes) {
		char[] hexChars = new char[bytes.length * 2];

		for (int j = 0; j < bytes.length; j++) {
			int v = bytes[j] & 0xFF;
			hexChars[j * 2] = HEX_ARRAY[v >>> 4];
			hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
		}
		return new String(hexChars).toLowerCase();
	}

	/**
	 * Convert a hex string to a byte array. Must be full bytes! AE13 ... etc.
	 * 
	 * @param hexString
	 * @return
	 */
	public static byte[] hexToBytes(final String hexString) {
		final int len = hexString.length();
		final byte[] data = new byte[len / 2];
		for (int i = 0; i < len; i += 2) {
			data[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4) + Character.digit(hexString.charAt(i + 1), 16));
		}
		return data;
	}
	
	
	public static short bytesToShortLE(final byte[] bytes) {
		ByteBuffer bb = ByteBuffer.allocate(2);
		bb.order(ByteOrder.LITTLE_ENDIAN);
		bb.put(bytes);
		short shortVal = bb.getShort(0);
		return shortVal;
	}
	
	public static short bytesToShortLE(final byte byte1, final byte byte2) {
		ByteBuffer bb = ByteBuffer.allocate(2);
		bb.order(ByteOrder.LITTLE_ENDIAN);
		bb.put(byte1);
		bb.put(byte2);
		short shortVal = bb.getShort(0);
		return shortVal;
	}

	public static int bytesToIntLE(final byte[] data) {
		ByteBuffer b = ByteBuffer.wrap(data);
		b.order(ByteOrder.LITTLE_ENDIAN);
		int num = b.getInt();
		return num;
	}

	public static byte[] shortToBytesLE(final short data) {
		ByteBuffer b = ByteBuffer.allocate(2);
		b.order(ByteOrder.LITTLE_ENDIAN);
		b.putShort(data);
		byte[] result = b.array();
		return result;
	}

	public static byte[] intToBytesLE(final int data) {
		ByteBuffer b = ByteBuffer.allocate(4);
		b.order(ByteOrder.LITTLE_ENDIAN);
		b.putInt(data);
		byte[] result = b.array();
		return result;
	}

	public static byte[] buildByteArrayFromString(String s, int len) {
		byte[] dst = new byte[len];
		byte[] src = s.getBytes();
		System.arraycopy(src, 0, dst, 0, src.length);
		if (len != 1) {
			dst[len - 1] = 0x00;
		}
		return dst;
	}

	public static byte[] padByteArray(byte[] input, int length) {
		ByteBuffer buffer = ByteBuffer.allocate(length);
		buffer.put(input);
		buffer.flip();
		return buffer.array();
	}
	
	public static void printHex(String title, byte[] buffer) {
		dumpHexData(System.out, title, buffer, buffer.length);
	}
	
	public static void dumpHexData(PrintStream out, String title, byte[] buf, int numBytes) {
		PrintWriter wrtr = new PrintWriter(new OutputStreamWriter(out));

		BitUtils.dumpHexData(wrtr, title, buf, 0, numBytes);
	}

	public static void dumpHexData(PrintWriter out, String title, byte[] buf, int offset, int numBytes) {
		int rows, residue, i, j;
		byte[] save_buf = new byte[ROW_BYTES + 2];
		char[] hex_buf = new char[4];
		char[] idx_buf = new char[8];

		out.println(title + " - " + numBytes + " bytes.");
		rows = numBytes >> 4;
		residue = numBytes & 0x0000000F;
		for (i = 0; i < rows; i++) {
			int hexVal = (i * ROW_BYTES);
			idx_buf[0] = HEX_ARRAY[((hexVal >> 12) & 15)];
			idx_buf[1] = HEX_ARRAY[((hexVal >> 8) & 15)];
			idx_buf[2] = HEX_ARRAY[((hexVal >> 4) & 15)];
			idx_buf[3] = HEX_ARRAY[(hexVal & 15)];

			String idxStr = new String(idx_buf, 0, 4);
			out.print(idxStr + ": ");

			for (j = 0; j < ROW_BYTES; j++) {
				save_buf[j] = buf[offset + (i * ROW_BYTES) + j];

				hex_buf[0] = HEX_ARRAY[(save_buf[j] >> 4) & 0x0F];
				hex_buf[1] = HEX_ARRAY[save_buf[j] & 0x0F];

				out.print(hex_buf[0]);
				out.print(hex_buf[1]);
				out.print(' ');

				if (j == ROW_QTR1 || j == ROW_HALF || j == ROW_QTR2)
					out.print(" ");

				if (save_buf[j] < 0x20 || save_buf[j] > 0x7E)
					save_buf[j] = (byte) '.';
			}

			String saveStr = new String(save_buf, 0, j);
			out.println(" | " + saveStr + " |");
		}

		if (residue > 0) {
			int hexVal = (i * ROW_BYTES);
			idx_buf[0] = HEX_ARRAY[((hexVal >> 12) & 15)];
			idx_buf[1] = HEX_ARRAY[((hexVal >> 8) & 15)];
			idx_buf[2] = HEX_ARRAY[((hexVal >> 4) & 15)];
			idx_buf[3] = HEX_ARRAY[(hexVal & 15)];

			String idxStr = new String(idx_buf, 0, 4);
			out.print(idxStr + ": ");

			for (j = 0; j < residue; j++) {
				save_buf[j] = buf[offset + (i * ROW_BYTES) + j];

				hex_buf[0] = HEX_ARRAY[(save_buf[j] >> 4) & 0x0F];
				hex_buf[1] = HEX_ARRAY[save_buf[j] & 0x0F];

				out.print((char) hex_buf[0]);
				out.print((char) hex_buf[1]);
				out.print(' ');

				if (j == ROW_QTR1 || j == ROW_HALF || j == ROW_QTR2)
					out.print(" ");

				if (save_buf[j] < 0x20 || save_buf[j] > 0x7E)
					save_buf[j] = (byte) '.';
			}

			for ( /* j INHERITED */ ; j < ROW_BYTES; j++) {
				save_buf[j] = (byte) ' ';
				out.print("   ");
				if (j == ROW_QTR1 || j == ROW_HALF || j == ROW_QTR2)
					out.print(" ");
			}

			String saveStr = new String(save_buf, 0, j);
			out.println(" | " + saveStr + " |");
		}
	}
	
	/**
	 * Add needle flag(s) to the haystack bitmask.
	 * 
	 * @param needle
	 * @param haystack
	 * @return
	 */
	public static int addToBitmask(int needle, int haystack) {
		return needle | haystack;
	}

	/**
	 * Remove needle flag(s) from the haystack bitmask.
	 * 
	 * @param needle
	 * @param haystack
	 * @return
	 */
	public static int removeFromBitmask(int needle, int haystack) {
		return haystack &= ~needle;
	}

	/**
	 * Check if the needle flag(s) are in the haystack mask. This is useful for
	 * checking if a value is in a bitmask. For example
	 * (MEDIUS_AUTHENTICATION_SERVER | MEDIUS_LOBBY_SERVER).
	 * 
	 * @param needle
	 * @param haystack
	 * @return
	 */
	public static boolean isInBitmask(int needle, int haystack) {
		return (needle & haystack) != 0;
	}
	
}
