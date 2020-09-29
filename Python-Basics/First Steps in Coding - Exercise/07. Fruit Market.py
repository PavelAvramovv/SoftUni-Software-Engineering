strawberry_price = float(input())
banana_countKg = float(input())
oranges_countKg = float(input())
raspberry_countKg  = float(input())
strawberry_countKg  = float(input())

raspberry_priceKg = strawberry_price/2
oranges_priceKg = raspberry_priceKg - (0.4 * raspberry_priceKg)
banana_priceKg = raspberry_priceKg - (0.8 * raspberry_priceKg)

sum_raspberry= raspberry_countKg*raspberry_priceKg
sum_oranges= oranges_countKg*oranges_priceKg
sum_banana = banana_countKg*banana_priceKg
sum_strawberry = strawberry_countKg*strawberry_price
total_sum = sum_raspberry+sum_oranges+sum_banana + sum_strawberry

print(total_sum)

"""
57.5
10
3.4
6.5
1.7
"""