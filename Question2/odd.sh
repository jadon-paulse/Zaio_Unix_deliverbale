#!/bin/sh
#Jadon

for i in {1..99}
do
        # rem variable finds odd numbers
        rem=$(($i % 2))
        #checks if rem does not equal 0
        if [ "$rem" -ne "0" ]; then
        # echo prints out odd number
                echo $i
        fi
done