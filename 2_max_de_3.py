def max_de_3(a,b,c):
    if(a>b>c):
        return a
    if(b>c>a):
        return b
    else:
        return c
a= input("Ingrese Un Valor>")
b= input("Ingrese Un Valor>")
c= input("Ingrese Un Valor>")

print("El mayor es ",max(a,b,c))
