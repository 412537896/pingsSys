import request from '@/utils/request';

/**
 *********************************************************
 * @desc ： 查询角色列表
 * @author Pings
 * @date   2019/3/8
 * @return ApiResponse
 * *******************************************************
 */
export async function queryList(params) {
  return request('/api/role/list', params);
}

/**
 *********************************************************
 * @desc ： 验证编码是否唯一
 * @author Pings
 * @date   2019/3/8
 * @param  code  用户名称
 * @return ApiResponse
 * *******************************************************
 */
export async function validateCodeUnique(code) {
  return request(`/api/role/validateCodeUnique/${code}`);
}

/**
 *********************************************************
 * @desc ： 保存
 * @author Pings
 * @date   2019/3/8
 * @return ApiResponse
 * *******************************************************
 */
export async function save(params) {
  return request('/api/role/save', {
    method: 'POST',
    body: params,
  });
}

/**
 *********************************************************
 * @desc ： 根据id删除
 * @author Pings
 * @date   2019/3/8
 * @param  id  编号
 * @return ApiResponse
 * *******************************************************
 */
export async function deleteById(id) {
  return request(`/api/role/deleteById/${id}`, {
    method: 'DELETE',
  });
}
