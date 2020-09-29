deposit_sum = float(input())
srok_deposit = int(input())
year_rest = float(input())/100

##natrupana_lihva = deposit_sum

total_sum2 = deposit_sum + srok_deposit * ((deposit_sum * year_rest)/12)
print(total_sum2)