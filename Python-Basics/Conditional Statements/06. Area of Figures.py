from math import pi
figure=str(input())
if figure=='square':
    square_a = float(input())
    square_s = square_a*square_a
    square_s = round(square_s, 3)
    print(square_s)

elif figure == 'rectangle':
    rectangle_a = float(input())
    rectangle_b = float(input())
    reactangle_s = rectangle_a*rectangle_b
    reactangle_s = round(reactangle_s, 3)
    print(reactangle_s)

elif figure=='circle':
    circle_R = float(input())
    circle_s = pi*(circle_R*circle_R)
    circle_s=round(circle_s, 3)
    print(circle_s)

elif figure=='triangle':
    triangle_a=float(input())
    triangle_ha=float(input())
    triangle_s = (triangle_a*triangle_ha)/2
    triangle_s = round(triangle_s, 3)
    print(triangle_s)

    #print((triangle_a*triangle_ha)/2)
    #rounded = round(45.67852, 2)  #45.68