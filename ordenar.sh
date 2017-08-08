#!/bin/bash


for file in ~/Downloads/base/*.jpg
    do
   
     echo ${file##*/} | tee -a ~/outputAlg.txt 
     . | grep | tee -a ~/outputAlg.txt
     echo '___________' | tee -a ./outputAlg.txt
done
