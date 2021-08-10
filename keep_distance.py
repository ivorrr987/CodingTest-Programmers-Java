#https://programmers.co.kr/learn/courses/30/lessons/81302
def solution(places):
    answer=[1,1,1,1,1]
    for place in places:
        for i in range(5):
            place[i]='E'+place[i]+'E'

    for place in places:
        place.insert(0,'EEEEEEE')
        place.append('EEEEEEE')

    print(places)

    for i in range(5):
        for j in range(1,6):
            for k in range(1,6):
                if places[i][j][k]=='P':
                    if (places[i][j-1][k]=='P') or (places[i][j+1][k]=='P') or (places[i][j][k-1]=='P') or (places[i][j][k+1]=='P'):
                        answer[i]=0
                elif places[i][j][k]=='0':
                    if (places[i][j-1][k]=='P' and places[i][j][k-1]=='P') or (places[i][j-1][k]=='P' and places[i][j][k+1]=='P') or (places[i][j-1][k]=='P' and places[i][j+1][k]=='P') or (places[i][j][k-1]=='P' and places[i][j][k+1]=='P') or (places[i][j-1][k]=='P' and places[i][j+1][k]=='P') or (places[i][j][k+1]=='P' and places[i][j+1][k]=='P'):
                        answer[i]=0                                                                                                                
    return answer

places=[["POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"], ["POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"], ["PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"], ["OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"], ["PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"]]
print(solution(places))