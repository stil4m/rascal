module experiments::Compiler::Benchmarks::BFor

value main(){
    for(i <- [1 .. 500000]){
       x=0;
    }
    return 0;
}