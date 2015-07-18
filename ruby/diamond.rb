module Named
  def initialize(name)
    @name = name
  end

  def greet()
    puts "Hello my name is #{@name}"
  end
end

module Flying
  def initialize(wings)
    @wings = wings
  end

  def fly()
    puts "I'm flying with my #{@wings} wings"
  end
end

class Bird
  include Named
  include Flying

  def initialize(name, wings)
    super(wings)
    @name = name
  end
end

bird = Bird.new 'flappy', 2
bird.greet
bird.fly
