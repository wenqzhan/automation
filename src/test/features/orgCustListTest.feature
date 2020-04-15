#language: zh-CN
功能:测试新matrix客户查询功能
  @Preparation
  场景:测试前参数设置
    当要开始测试,设置参数

  @Automation
  场景:查询工商落库逻辑1
    当查询"cust_info""有"的数据
    假如直接从cust_info取值，不调工商接口
    那么通过测试

  @Automation
  场景:查询工商落库逻辑2
    当查询"search_cust""有"的数据
    假如调工商接口查询数据，判断search_cust中是否存在，如果存在则不插入新数据
    那么通过测试

  @Automation
  场景:查询工商落库逻辑3
    当查询"search_cust""没有"的数据
    假如存search_cust，点击360视图时在cust_info中插入数据
    那么通过测试

  @Automation
  场景:客户查询条件1
    当"单个"查询条件查询
    假如查询结果正确
    那么通过测试

  @Automation-skip
  场景:客户查询条件2
    当"组合"查询条件查询
    假如查询结果正确
    那么通过测试

  @Automation-skip
  场景:字段值对应
    当数据库与返回数据比对
    假如数据一致，数据库比对
    那么通过测试

  @CloseDriver
  场景: 退出驱动
    当全部完成时退出驱动









