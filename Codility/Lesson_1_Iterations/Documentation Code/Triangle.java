public class Triangle {

    // Lesson 1: Iterations - Triangle Example

    // Nested Loop method
    public static void triangle(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Test
    public static void main(String[] args) {

        triangle(1);
        triangle(2);
        triangle(3);
        triangle(4);
        triangle(5);
        triangle(6);
    }
}

// Expected Output

// *
//*
//**
//*
//**
//***
//*
//**
//***
//****
//*
//**
//***
//****
//*****
//*
//**
//***
//****
//*****
//******
