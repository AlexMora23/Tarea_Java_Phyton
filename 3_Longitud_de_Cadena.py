def longitud(cadena):
    #return (cadena)
#cadena=input("Escribe una frase o cadena> ")

#print (len(cadena))
    
    lon=0
    for i in cadena:
        lon+=1
    return(lon)
cadena=input("Ingresa una cadena> ")    
print (longitud(cadena))
