package com.test.demo

def Prime(def num)
{
def	i=2
def	count=0
while(i<num)
	{
	if (num%i==0){
		count=count+1
	if (count==1){
				return false
			}
		}
		i=i+1
	}
	return true
 }

 print "enter the num: "
def num= 23
 result=Prime(num)
 if (result){
	 println "yes $num prime number"
 }
 else{ println "$num is not a primenumber"}

  
