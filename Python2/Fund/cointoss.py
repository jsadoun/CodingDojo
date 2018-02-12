import random

def coinToss(flips):
    heads = 1
    tails = 2
    head_count = 0
    tail_count = 0
    for i in range(flips):
        toss = random.randint(1,2) #generates "random" integers w/ 1 & 2 as the only options
        #print toss  #<- shows you what the random toss is
        if toss == heads:
            head_count += 1
            print "Throwing a coin .. It's a head! ... Got " + str(head_count) + "head(s) and " + str(tail_count) + "tail(s) so far"
        elif toss == tails:
            tail_count += 1
            print "Throwing a coin .. It's a tail! ... Got " + str(head_count) + "head(s) and " + str(tail_count) + "tail(s) so far"
    
    
coinToss(10)