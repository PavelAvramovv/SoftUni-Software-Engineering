length = int(input())
width = int(input())
height = int(input())
percent_use = float(input())

V = length * width * height
total_liters = V * 0.001
percent =  percent_use * 0.01
needed_liters = total_liters*(1-percent)
print(needed_liters)

"""
85
75
47
17
"""