days_company_start = int(input())
confectioners = int(input())
cakes_count = int(input())
waffles_count  = int(input())
pinecakes_count  = int(input())

cakes_price  = 45
waffles_price = 5.80
pinecakes_price= 3.20

cakes = cakes_count*cakes_price
waffles = waffles_count*waffles_price
pinecakes = pinecakes_count*pinecakes_price

total_sum_per_day = (cakes+waffles+pinecakes)*confectioners
total_sum_from_company = total_sum_per_day*days_company_start
total_sum_after_costs = total_sum_from_company - ((1/8)*total_sum_from_company)
print (total_sum_after_costs)

