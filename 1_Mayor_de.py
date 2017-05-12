def max(x,y):
    if(x>y):
        return x
    elif(y>x):
        return y
    else:
        print("Son iguales")

x=input("Ingrese Un Valor>")

y=input("Ingrese Otro Valor>")
print ("El numero mayor es ",max(x,y))
