import random
from select import select
def choose():
    words=('Cristiano','Ronaldo','Messi','Madrid','Manchester United','Manchester United','Sergio','Virgil Van Djik','Kevin De Bruyne','Luis Saurez',
    'Ramos','Benzema','MarceloTwele','Mbappe','Vinicous','NeymarJr','Salah','Lewandowski','BrunoFernandes','Cavani',
    'Haaland','Paris Saint Germain','Real Madrid','Liverpool','FCBarcelona','Sunil Chetri','Luka Modric','Casemiro','Toni Kroos',
    'PaulPogba','Kante','DavidDeGea','Allison','Ederson','JanOblak','Courtois','Buffon','IkerCasillas','KeylorNavas','Mesut Ozil',
    'Zlatan','Ibhramovic','Jesus Gabriel','Maguire','Diego Jota','Beranado Silva','Harry Kane','Joa Cancelo','Danilo','Marquoins','Saka',
    'RoberFirmino','RonaldoJr','Fikru','Pessi')
    select=random.choice(words)
    return select 

def jumble(word):
    jumbled="".join(random.sample(word,len(word)))
    return jumbled

def play():
    print("________________________________")
    print("WELCOME TO THE JUMBLE FOOTBALL")
    print("________________________________")
    player1=input('Enter your Name player 1: ')
    player2=input('Enter your Name player 2: ')
    point1=0
    point2=0
    turn=0
    while(1):
        #computer tasked
        picked_word=choose()
        #create questions
        qn=jumble(picked_word)
        print(qn)
        #for player 1
        if turn%2==0:
            print(player1,'Your Turn')
            ans=input('Tell the answer ')
            if ans==picked_word:
                print(player1,'your answer is correct')
                point1=point1+1
                print('your total points are ',point1)
            else:
                print('Better luck next time your points are',point1)
            exit=input('If you want to continue the game press 0 or else print 1 ')
            iexit=int(exit)
            if iexit==1:
                break
        #for player 2
        else:
            print(player2,'Your Turn')
            ans=input('Tell the answer ')
            if ans==picked_word:
                print(player2,'your answer is correct')
                point2=point2+1
                print('your total points are',point2)
            else:
                print('Better luck next time your points are',point2)
            exit=input('If you want to continue the game press 0 or else print 1 ')
            iexit=int(exit)
            if iexit==1:
                break
        turn=turn+1
    print("Final Points of Both The Gamers:")
    print(player1,"=",point1)
    print(player2,"=",point2)
    if(point1>point2):
        print("And the winner is one and only",player1)
    elif(point1<point2):
        print("And the winner is one and only",player2)
    else:
        print("Game is draw,Both have same points i.e. :",point1)
    print("________________________________")    
    print("THANKYOU FOR PLAYING GAME")    
    print("________________________________")

play()