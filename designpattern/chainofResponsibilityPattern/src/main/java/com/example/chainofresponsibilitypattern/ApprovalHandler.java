package com.example.chainofresponsibilitypattern;

/**
 * @Author leezihong
 * @Date 2023/4/17 0:40
 * @Version 1.0
 * @description TODO
 */
public abstract class ApprovalHandler {
    /**
     * 责任链得的下一个处理对象
     */
    protected ApprovalHandler next;

    /**
     * 设置下一个处理对象
     */
    public void setNextHanlder(ApprovalHandler approvalHandler) {
        this.next = approvalHandler;
    }

    /**
     * 处理程序
     */
    public abstract void approval(ApprovalHandler approvalHandler);

    /**
     * 调用下一个处理对象
     */
    public void useNextHandler(ApprovalHandler approvalHandler) {
        if(next != null){
            next.approval(approvalHandler);
        }
    }

}
