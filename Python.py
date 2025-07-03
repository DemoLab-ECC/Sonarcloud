import os

def insecure():
    password = input("Enter your password: ")
    print("You entered:", password)  # Hardcoded printing of sensitive data

def os_injection():
    filename = input("Enter filename to delete: ")
    os.system("rm -rf " + filename)  # Dangerous: command injection risk

insecure()
os_injection()
