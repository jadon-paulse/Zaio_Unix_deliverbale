#!bin/bash
#Jack Stevenson

# take 2 inputs x and y

#check if x is less than y - output "X is less than Y"
read -p "Enter X: " x;
read -p "Enter Y: " y;
read -p "Enter Z: " z;


echo $x;
echo $y;

# else output "Y is less than X"


if [ $x -lt $y ];
    then echo "X is less than Y";
    else echo "Y is less than X";
fi;