def alphabet_index c
    char_int = c.ord
    if char_int > 96 && char_int < 123
        return char_int - 97
    elsif char_int > 64 && char_int < 91
        return char_int - 65
    else
        return -1
    end
end