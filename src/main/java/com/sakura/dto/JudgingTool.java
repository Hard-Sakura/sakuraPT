package com.sakura.dto;

/**
 * @desc: boolean判断工具类
 * @auther: Sakura
 * @date: 9:11
 */
public class JudgingTool {

	/**
	 * 返回boolean类型
     */
    private boolean result;

    /**
     * 文字信息
     */
    private String message;

	/**
	 * 接收数值类型，result>=1->true，result<=0->false
	 */
	private int res;

	/**
	 * 接收值
	 */
	private Object object;

	public boolean isResult() {
		return result;
	}

	public boolean getResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

    public String getMessage() {
	    return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
	    return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public int getRes() {
	    return res;
    }

    public void setRes(int res) {
        if (res == 998) {
	        setResult(false);
	        setMessage("操作失败，系统异常，请联系管理员");
        } else if (res == 1) {
	        setResult(true);
	        setMessage("新增成功！");
        }else if (res == 2) {
	        setResult(true);
	        setMessage("删除成功！");
        }else if (res == 3) {
	        setResult(true);
	        setMessage("修改成功！");
        }else if (res == 4) {
	        setResult(true);
	        setMessage("导入成功！");
        } else {
	        setResult(false);
        }
        this.res = res;
    }

    @Override
    public String toString() {
	    return "JudgingTool{" +
			    "result=" + result +
			    ", message='" + message + '\'' +
			    ", res=" + res +
			    '}';
    }
}
