package accessModifiers;

public class UnderstandingAccessModifiers {
    public static void main(String[] args) {
        /*
        ACCESS MODIFIERS
        1. public: accessible everywhere in the project
        2. protected: package protected (can act like public in
        case of inheritance)
            if there is inheritance: it will act like public
            if there is no inheritance: it will act like default
        3. default: package protected
        4. private: class protected

        most accessible to least accessible
        public-protected-default-private

        NON-ACCESS MODIFIERS
        1. static
        2. final

        - Access modifiers is related to access level of class and
        its members
        - Some access modifiers make it east to access some members of
        a class
        - On the other hand, some access modifiers restrict the access
        to some members of a class

        CLASS:
        - Class can be public or default
        - public class: can be instantiated anywhere in the project
        - default class: can be instantiated only in the same package

        - Class can be final: you cannot inherit - this class cannot be
        a parent anymore

        NOTE: Class can never be private or protected (compiler error)
        NOTE: Outer class can never be static
        Inner classes can be static as they are inside the outer class

        CONSTRUCTOR:
        - private constructor: allows us to crete object only in the
        same class
        - default constructor: allows us to create object only in the
        same package
        - protected constructor: based on having inheritance or not,
        it will act like default or public
        - public constructor: allows us to create objects everywhere
        in the project

        INSTANCE VARIABLES
        private instance variables: can be accessed only in the same class
        default instance variables: can be accessed only in the same package
        protected instance variables: based on having inheritance or not,
        it will act like default or public
        public instance variables: can be accessed everywhere in the project

        static instance variable: it belongs to Class and can be called
        with class name
        final instance variable: it has initial value and this initial
        can never be changed

        METHODS
        private methods: can be accessed only in the same class
        default methods: can be accessed only in the same package
        protected methods: based on having inheritance or not,
        it will act like default or public
        public methods: can be accessed everywhere in the project

        static methods: it belongs to class and can be called with class name
        final methods:

        BLOCKS: We have static and instance blocks
        - Blocks will not take any access modifiers as they are notinvoked
        with class name or object
        - Blocks can not be final as well

         */
    }
}
