struct node{
    int data;
    struct node *next;
};
bool isHappy(int n) {
    int visited[1000] = {0};

    while(1){
        struct node *head = NULL, *temp, *newNode;
        int sum = 0;
    
        while(n!=0){
            newNode = (struct node*)malloc(sizeof(struct node));
            newNode->data = n % 10;
            newNode->next = head;
            head = newNode;

            n= n /10;
        }
        temp = head;
        while(temp!=NULL){
            temp->data = temp->data * temp->data;
            sum = sum + temp->data;
            temp = temp->next;
        }
        temp=head;
        while(temp!=NULL){
            struct node*p = temp;
            temp = temp->next;
            free(p);
        }
        if(sum == 1){
            return true;
        }
        if(visited[sum] == 1){
            return false;
        }
        visited[sum] = 1;
        n = sum;
    }
}
