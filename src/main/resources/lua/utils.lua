


-- Pretty console print handler
function log(logLevel, text)
	if (type(logLevel) ~= "number") then
		error ("Illegal log level type provided, this must be a number")
	end
	if logLevel < 0 or logLevel > 3 then
		error ("Illegal log level provided, use 'info' for informational messages")
		return
	end
	local logLevelName = ""
	if logLevel == 0 then
		logLevelName = "DEBUG"
	elseif logLevel == 1 then
		logLevelName = "INFO"
	elseif logLevel == 2 then
		logLevelName = "WARN"
	elseif logLevel == 3 then
		logLevelName = "ERROR"
	end
	print(os.date("[%H:%M:%S] [" .. logLevelName .. "] " .. text))
end

function string.startsWith(str, start)
	return string.sub(str,1,string.len(start))==start
end

function string.endsWith(str, ending)
	return ending == '' or string.sub(str,-string.len(ending))==ending
end

function string.trim(str)
	return (str:gsub("^%s*(.-)%s*$", "%1"))
end

function table.implode(list, separator)
	return table.concat(list, separator)
end

function string.explode(str, separator)
	assert(type(str) == "string" and type(separator) == "string", "invalid arguments")
	local o = {}
	while true do
		local pos1,pos2 = str:find(separator)
		if (not pos1) then
			o[#o+1] = str
			break
		end
		o[#o+1],str = str:sub(1,pos1-1),str:sub(pos2+1)
	end
	return o
end

