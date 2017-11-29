class Animal
  attr_accessor :name
  attr_writer :color
  attr_reader :legs, :arms

  def noise=(noise)
    @noise = noise
  end

  def noise
    @noise
  end
end

animal1 = Animal.new
animal1.noise = "Moo!"
animal1.name = "Steve"
animal1.color = "black"
animal1.legs = 4
puts animal1.legs
puts animal1.color
puts animal1.name
puts animal1.noise

animal2 = Animal.new
animal2.noise = "Quack!"
puts animal2.noise
