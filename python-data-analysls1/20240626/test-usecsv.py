import usecsv
import os

print(os.getcwd())
os.chdir(r'c:\Users\human-33\python-data-analysls1\20240626')

a = [['국어','영어','수학'],[99,88,77]]
usecsv.writecsv('test.csv', a)

total = usecsv.opencsv(r'c:\Users\human-33\python-data-analysls1\20240626\popSeoul2023.csv')
print(usecsv.switch(total))