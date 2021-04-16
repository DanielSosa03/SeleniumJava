# def run():
#     for i in range (1,31):
#         if i % 3 != 0:
#             mul_de_tres = i  
#         else:
#             multiplo_de_tres = i
#             if multiplo_de_tres % 5 == 0:
#                 #mul_de_los_dos = i
#                 print("FizzBuzz")
#             else:
#                 print("Fizz")
            

#         if i % 5 != 0:
#             mul_de_cinco = i
#         else:
#             multiplo_de_cico = i
#             if multiplo_de_cico % 3 != 0:
#                 print("Buzz")
#         if mul_de_tres == mul_de_cinco:
#             #res_de_los_dos = i
#             print(i)

def run():
    for i in range(1,31):
        if i % 3 == 0 and i % 5 == 0:
            print("FizzBuzz")
        else:
            if i % 3 == 0:
                print("Fizz")
            elif i % 5 == 0:
                print("Buzz")
            else:
                print(i)


if __name__ == "__main__":
    run()
        