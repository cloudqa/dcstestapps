package model.server.serviceinterface;

import java.lang.reflect.Method;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import javax.interceptor.Interceptors;

import model.common.DeptViewSDO;
import model.common.serviceinterface.C2AMService;

import oracle.jbo.common.Diagnostic;
import oracle.jbo.common.sdo.SDOHelper;
import oracle.jbo.common.service.types.FindControl;
import oracle.jbo.common.service.types.FindCriteria;
import oracle.jbo.server.svc.ServiceContextInterceptor;
import oracle.jbo.server.svc.ServiceImpl;
import oracle.jbo.service.errors.ServiceException;

import oracle.webservices.annotations.PortableWebService;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Nov 17 15:12:02 PST 2011
// ---------------------------------------------------------------------
@Stateless(name="model.common.C2AMServiceBean", mappedName="C2AMServiceBean")
@Remote(C2AMService.class)
@PortableWebService(targetNamespace="/model/common/", serviceName="C2AMService",
    portName="C2AMServiceSoapHttpPort", endpointInterface="model.common.serviceinterface.C2AMService")
@Interceptors( { ServiceContextInterceptor.class })
public class C2AMServiceImpl extends ServiceImpl implements C2AMService {
    private static boolean _isInited = false;

    /**
     * This is the default constructor (do not remove).
     */
    public C2AMServiceImpl() {
        init();
        setApplicationModuleDefName("model.C2AM");
        setConfigurationName("C2AMService");
    }

    /**
     * Generated method. Do not modify. Do initialization in the constructor
     */
    protected void init() {
        if (_isInited) {
            return;
        }
        synchronized (C2AMServiceImpl.class) {
            if (_isInited) {
                return;
            }
            try {
                SDOHelper.INSTANCE.defineSchema("model/common/serviceinterface/", "C2AMService.xsd");
                _isInited = true;
            } catch (Exception ex) {
                Diagnostic.printStackTrace(ex);
            }
        }
    }

    /**
     * getDeptView1: generated method. Do not modify.
     */
    public DeptViewSDO getDeptView1(Integer deptno) throws ServiceException {
        return (DeptViewSDO)get(new Object[] { deptno }, "DeptView1",
                                DeptViewSDO.class);
    }

    /**
     * createDeptView1: generated method. Do not modify.
     */
    public DeptViewSDO createDeptView1(DeptViewSDO deptView1) throws ServiceException {
        return (DeptViewSDO)create(deptView1, "DeptView1");
    }

    /**
     * updateDeptView1: generated method. Do not modify.
     */
    public DeptViewSDO updateDeptView1(DeptViewSDO deptView1) throws ServiceException {
        return (DeptViewSDO)update(deptView1, "DeptView1");
    }

    /**
     * deleteDeptView1: generated method. Do not modify.
     */
    public void deleteDeptView1(DeptViewSDO deptView1) throws ServiceException {
        delete(deptView1, "DeptView1");
    }

    /**
     * mergeDeptView1: generated method. Do not modify.
     */
    public DeptViewSDO mergeDeptView1(DeptViewSDO deptView1) throws ServiceException {
        return (DeptViewSDO)merge(deptView1, "DeptView1");
    }

    /**
     * findDeptView1: generated method. Do not modify.
     */
    public List<DeptViewSDO> findDeptView1(FindCriteria findCriteria,
                                           FindControl findControl) throws ServiceException {
        return (List<DeptViewSDO>)find(findCriteria, findControl, "DeptView1",
                                       DeptViewSDO.class);
    }
}
