#!/bin/bash


for file in ~/Downloads/base/*.jpg
    do
   
     echo ${file##*/} | tee -a ~/outputAlg.txt 
     ./pico ../cascades/facefinder -i $file -v | grep -v ^# |awk '{print $2,$1,$3}' | tee -a ~/outputAlg.txt
     echo '___________' | tee -a ./outputAlg.txt
done
