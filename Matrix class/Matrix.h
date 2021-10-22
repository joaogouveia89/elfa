#ifndef MATRIX_H
#define MATRIX_H

#include<vector>
#include <algorithm>
#include <string>
#include<numeric>

template<typename T>
class Matrix{
protected:
    int _width;
    int _height;
    std::vector<T> _members;

public:
    Matrix(std::vector<std::vector<T>> members){
        _height = members.size();
        _width = members.front().size();
        for(std::vector<T> line : members){
            _members.insert(std::end(_members), std::begin(line), std::end(line));
        }
    }

    Matrix(int width, int height): _width(width), _height(height){
        int vectorSize = width * height;
        for(int i = 0; i < vectorSize; i++)
            _members.emplace_back(0);
    }
    
    T Get(int row, int column){
        if(row >= _width && column >= _height)
            throw "Matrix out bound[" + std::to_string(row) + "][" + std::to_string(column) + "]\n";
        return _members[row * _width + column];
    }

    void Set(int row, int column, T value){
        if(row >= _width && column >= _height)
            throw "Matrix out bound[" + std::to_string(row) + "][" + std::to_string(column) + "]\n";
        _members[row * _width + column] = value;
    }

    int RowSum(int rowNumber){
        return std::accumulate(_members.begin() + (_width * rowNumber) ,_members.begin() + (_width * rowNumber) + _width,0);
    }

    int ColumnSum(int columnNumber){
        int sum = 0;
        int membersSize = _members.size();
        for(int i = columnNumber; i < membersSize; i+= _width){
            sum += _members[i];
        }
        return sum;
    }
};
#endif