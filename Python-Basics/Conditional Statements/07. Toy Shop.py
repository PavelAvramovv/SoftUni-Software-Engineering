price_trip = float(input())
puzzel_count = int(input())
dolls_count = int(input())
bear_count = int(input())
minions_count = int(input())
trucks_count = int(input())

#prices
puzzel_price =2.60
doll_price = 3
bear_price = 4.10
minion_price = 8.20
truck_price = 2

total_price = puzzel_count*puzzel_price+ dolls_count*doll_price+ bear_count*bear_price +minions_count*minion_price + trucks_count*truck_price

toys_count = puzzel_count+dolls_count+bear_count+minions_count+trucks_count

if toys_count>=50:
    total_price -= total_price*0.25

total_win_with_rent = total_price-total_price*0.10
residue = abs(total_win_with_rent-price_trip)
if total_win_with_rent >= price_trip:

    print(f'Yes! {residue:.2f} lv left.')

else:print(f'Not enough money! {residue:.2f} lv needed.')
