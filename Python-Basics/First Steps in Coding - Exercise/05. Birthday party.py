rent_for_hall = int (input())
cake_price = rent_for_hall * 0.20
drinks_price = cake_price - (cake_price*0.45)
animator_price = (1/3)*rent_for_hall
needed_sum = rent_for_hall+cake_price+drinks_price+animator_price
print (needed_sum)