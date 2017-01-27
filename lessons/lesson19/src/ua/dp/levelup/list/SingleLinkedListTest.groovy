package ua.dp.levelup.list

/**
 * Created by java on 24.01.2017.
 */
class SingleLinkedListTest extends spock.lang.Specification {
    def "AddNode"() {
        SingleLinkedList list = new SingleLinkedList();
        when: 'add node'
        list.addNode(new Node(1));

        then: 'checksize'
        list.size == 1;
        list.root !=null;
        list.root.next == null;

        when: 'add one more node'
        list.addNode(new Node(1));

        then: 'checksize'
        list.size == 2;
        list.root != null;
    }
}