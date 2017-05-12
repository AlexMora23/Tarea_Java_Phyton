def superposicion2(lista1,lista2):
    return (lista1,lista2)
lista1 = [1,2,3,4,7]
lista2 = [9,0,5,6]
if list(set(lista1) & set(lista2)):
    print (True)
else:
    print (False)
