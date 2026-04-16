from collections import deque

def invertirq(cola: deque):
    if not cola: 
        return
    inicio=cola.popleft()
    invertirq(cola)
    cola.append(inicio)


cola=deque([1,2,3,4,5])
print("Original, quieta, nueva:",list(cola))
invertirq(cola)
print("invertida, alterada, renovada:",list(cola))
    
