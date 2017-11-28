
def welcome(name="World")
	puts "Hello #{name}!"
	1 + 1
end

def add_and_subtract(n1=0, n2=0)
	add = n1 + n2
	sub = n1 - n2
	return [add, sub]
end

def longest_word(words=[])
  longest_word = words.inject do |memo,word|
    memo.length > word.length ? memo : word
  end
  puts longest_word
end

def over_five?(value=nil)
	puts value.to_i > 5 ? 'Over 5' : 'Not over 5'
end

welcome("Mary")

result = add_and_subtract(2, 2)
puts result[0]
puts result[1]
[add, sub] = add_and_subtract(8, 3)
puts add
puts sub

fruits = ['apple', 'pear', 'banana', 'plum']
longest_word(fruits)

over_five?(112 / 18)
