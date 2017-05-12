def palindromo(var):
    return var
var = input("Ingrese un palabra::> ")
if var==var[::-1]:
	print ("Es Palindromo")
else:
	print ("No es palindromo")
