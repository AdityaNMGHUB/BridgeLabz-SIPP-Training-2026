package heaps;

import java.util.*;

class Q6{
    List<Integer> mergeKSortedLists(List<List<Integer>> lists){
PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->lists.get(a[0]).get(a[1])-lists.get(b[0]).get(b[1]));

for(int i=0;i<lists.size();i++){
if(!lists.get(i).isEmpty())
pq.offer(new int[]{i,0});
}

List<Integer> ans=new ArrayList<>();

while(!pq.isEmpty()){
int[] cur=pq.poll();
int list=cur[0];
int idx=cur[1];

ans.add(lists.get(list).get(idx));

if(idx+1<lists.get(list).size())
pq.offer(new int[]{list,idx+1});
}

return ans;
}
}