local Vec2 = class('Vec2')

function Vec2:add(x, y)
    
end


local metatables = {
    __dtype = "vector",
    __add = (function(left, right)
        left.value = left.value + right.value;
        return left
    end)
}

function Vec2:__add(a, b)
    print(a, b)
end

return Vec2
