class Animal
  attr_accessor :noise
  
end

animal1 = Animal.new
animal1.noise = "Moo!"
puts animal1.noise

animal2 = Animal.new
animal2.noise = "Quack!"
puts animal2.noise
