def lower_bound(val):
    start=0
    end=len(p)
    mid=end
    while end-start>0:
        mid=(start+end)//2
        if p[mid]<val:start=mid+1
        else:end=mid
    return end+1
def dfs(x):
    for i in range(len(l[x])):
        y=l[x][i]
        if t[y]:continue
        t[y]=True
        if q[y]==0 or dfs(q[y]):
            q[y]=x
            return True
    return False
a=int(input())
p=[]
o=[]
h=["" for i in range(a)]
for i in range(a):
    b,c=map(int,input().split())
    p.extend([b+c,b-c,b*c])
    o.append([b,c])
p=list(set(p))
p.sort()
l=[[]]
for i in range(a):
    l.append([lower_bound(o[i][0]+o[i][1]),lower_bound(o[i][0]-o[i][1]),\
              lower_bound(o[i][0]*o[i][1])])
q=[0]*8001
t=[0]*8001
cnt=0
for i in range(a):
    t=[False]*8001
    if dfs(i+1):
        cnt+=1
if cnt==a:
    for i in range(a*3):
        if q[i+1]!=0:
            r=o[q[i+1]-1]
            if r[0]+r[1]==p[i]:
                h[q[i+1]-1]=str(r[0])+" + "+str(r[1])+" = "+str(p[i])
            elif r[0]-r[1]==p[i]:
                h[q[i+1]-1]=str(r[0])+" - "+str(r[1])+" = "+str(p[i])
            else:
                h[q[i+1]-1]=str(r[0])+" * "+str(r[1])+" = "+str(p[i])
    for i in range(a):
        print(h[i])
else:
    print("impossible")