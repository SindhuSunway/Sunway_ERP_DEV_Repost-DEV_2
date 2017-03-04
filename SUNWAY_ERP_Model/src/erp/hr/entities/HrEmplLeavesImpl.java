package erp.hr.entities;

import java.math.BigDecimal;

import java.sql.Timestamp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

import oracle.jbo.Key;
import oracle.jbo.RowSet;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jan 04 20:17:06 AST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class HrEmplLeavesImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        EmployeeNo,
        LeaveType,
        LeaveCode,
        StartDate,
        EndDate,
        TotalDaysOnVac,
        LeaveBalance,
        LeaveStatus,
        DateReported,
        Delegation,
        NotesToDelegation,
        Approver,
        NotesApprover,
        ExitPermit,
        Notesremarks,
        HrLookupTblView1,
        HrLookupTblView2,
        HrLookupTblView3;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int EMPLOYEENO = AttributesEnum.EmployeeNo.index();
    public static final int LEAVETYPE = AttributesEnum.LeaveType.index();
    public static final int LEAVECODE = AttributesEnum.LeaveCode.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int TOTALDAYSONVAC = AttributesEnum.TotalDaysOnVac.index();
    public static final int LEAVEBALANCE = AttributesEnum.LeaveBalance.index();
    public static final int LEAVESTATUS = AttributesEnum.LeaveStatus.index();
    public static final int DATEREPORTED = AttributesEnum.DateReported.index();
    public static final int DELEGATION = AttributesEnum.Delegation.index();
    public static final int NOTESTODELEGATION = AttributesEnum.NotesToDelegation.index();
    public static final int APPROVER = AttributesEnum.Approver.index();
    public static final int NOTESAPPROVER = AttributesEnum.NotesApprover.index();
    public static final int EXITPERMIT = AttributesEnum.ExitPermit.index();
    public static final int NOTESREMARKS = AttributesEnum.Notesremarks.index();
    public static final int HRLOOKUPTBLVIEW1 = AttributesEnum.HrLookupTblView1.index();
    public static final int HRLOOKUPTBLVIEW2 = AttributesEnum.HrLookupTblView2.index();
    public static final int HRLOOKUPTBLVIEW3 = AttributesEnum.HrLookupTblView3.index();

    /**
     * This is the default constructor (do not remove).
     */
    public HrEmplLeavesImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erp.hr.entities.HrEmplLeaves");
    }


    /**
     * Gets the attribute value for EmployeeNo, using the alias name EmployeeNo.
     * @return the value of EmployeeNo
     */
    public BigDecimal getEmployeeNo() {
        return (BigDecimal) getAttributeInternal(EMPLOYEENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmployeeNo.
     * @param value value to set the EmployeeNo
     */
    public void setEmployeeNo(BigDecimal value) {
        setAttributeInternal(EMPLOYEENO, value);
    }

    /**
     * Gets the attribute value for LeaveType, using the alias name LeaveType.
     * @return the value of LeaveType
     */
    public String getLeaveType() {
        return (String) getAttributeInternal(LEAVETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LeaveType.
     * @param value value to set the LeaveType
     */
    public void setLeaveType(String value) {
        setAttributeInternal(LEAVETYPE, value);
    }

    /**
     * Gets the attribute value for LeaveCode, using the alias name LeaveCode.
     * @return the value of LeaveCode
     */
    public String getLeaveCode() {
        return (String) getAttributeInternal(LEAVECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LeaveCode.
     * @param value value to set the LeaveCode
     */
    public void setLeaveCode(String value) {
        setAttributeInternal(LEAVECODE, value);
    }

    /**
     * Gets the attribute value for StartDate, using the alias name StartDate.
     * @return the value of StartDate
     */
    public Timestamp getStartDate() {
        return (Timestamp) getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for StartDate.
     * @param value value to set the StartDate
     */
    public void setStartDate(Timestamp value) {
        setAttributeInternal(STARTDATE, value);
        setLeaveStatus("Requested");
    }

    /**
     * Gets the attribute value for EndDate, using the alias name EndDate.
     * @return the value of EndDate
     */
    public Timestamp getEndDate() {
        return (Timestamp) getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EndDate.
     * @param value value to set the EndDate
     */
    public void setEndDate(Timestamp value) {
        setAttributeInternal(ENDDATE, value);
        System.out.println("calculating no.of days in vacation");
                int numOfDays=0;long diff=0;
                //int leaveBal=0;int leaveBalUpdated=0;
                Timestamp startDate=getStartDate();
                Timestamp endDate=getEndDate();
                diff = endDate.getTime()-startDate.getTime();//in Milli seconds
                numOfDays = (int) (diff / (1000 * 60 * 60 * 24));
                System.out.println("numOfDays"+numOfDays);
                setTotalDaysOnVac(numOfDays);
                /*leaveBal=getLeaveBalance();
                leaveBalUpdated=leaveBal-numOfDays;
                setLeaveBalance(leaveBalUpdated);*/
                
    }

    /**
     * Gets the attribute value for TotalDaysOnVac, using the alias name TotalDaysOnVac.
     * @return the value of TotalDaysOnVac
     */
    public Integer getTotalDaysOnVac() {
        return (Integer) getAttributeInternal(TOTALDAYSONVAC);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalDaysOnVac.
     * @param value value to set the TotalDaysOnVac
     */
    public void setTotalDaysOnVac(Integer value) {
        setAttributeInternal(TOTALDAYSONVAC, value);
    }

    /**
     * Gets the attribute value for LeaveBalance, using the alias name LeaveBalance.
     * @return the value of LeaveBalance
     */
    public Integer getLeaveBalance() {
        return (Integer) getAttributeInternal(LEAVEBALANCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LeaveBalance.
     * @param value value to set the LeaveBalance
     */
    public void setLeaveBalance(Integer value) {
        setAttributeInternal(LEAVEBALANCE, value);
        setLeaveStatus("Completed");
    }

    /**
     * Gets the attribute value for LeaveStatus, using the alias name LeaveStatus.
     * @return the value of LeaveStatus
     */
    public String getLeaveStatus() {
        return (String) getAttributeInternal(LEAVESTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for LeaveStatus.
     * @param value value to set the LeaveStatus
     */
    public void setLeaveStatus(String value) {
        setAttributeInternal(LEAVESTATUS, value);
    }

    /**
     * Gets the attribute value for DateReported, using the alias name DateReported.
     * @return the value of DateReported
     */
    public Timestamp getDateReported() {
        return (Timestamp) getAttributeInternal(DATEREPORTED);
    }

    /**
     * Sets <code>value</code> as the attribute value for DateReported.
     * @param value value to set the DateReported
     */
    public void setDateReported(Timestamp value) {
        setAttributeInternal(DATEREPORTED, value);
        System.out.println("calculating no.of days in vacation based on date of reporting");
        int numOfDays=0;long diff=0,numOfDaysOnVact=0;int leaveBal=0;int leaveBalUpdated=0;
        Timestamp reportingDate=getDateReported();
        Timestamp endDate=getEndDate();
        diff = reportingDate.getTime()-endDate.getTime();//in Milli seconds
        numOfDays = (int) (diff / (1000 * 60 * 60 * 24));
        System.out.println("numOfDays"+numOfDays);
            if(numOfDays==1)
              {
                 numOfDaysOnVact=getTotalDaysOnVac();
                 leaveBal=getLeaveBalance();
               //  if(leaveBal>numOfDaysOnVact)
                // {
                  leaveBalUpdated = (int) (leaveBal - numOfDaysOnVact);
                  setLeaveBalance(leaveBalUpdated);
                  setLeaveStatus("Completed");   
                     System.out.println("If Block");
                 //  }
                 }else 
                 {
                   endDate=reportingDate;
                   Date dateBefore = new Date(endDate.getTime() - 1 * 24 * 3600 * 1000);
                   Timestamp sq = new Timestamp(dateBefore.getTime());
                   setEndDate(sq);
                   int noOfDaysOnVacNew=0,newLeaveBal=0,bal;
                   noOfDaysOnVacNew=getTotalDaysOnVac();
                   newLeaveBal=getLeaveBalance();
                   bal=newLeaveBal-noOfDaysOnVacNew;
                   setLeaveBalance(bal);
                 }
     }


    /**
     * Gets the attribute value for Delegation, using the alias name Delegation.
     * @return the value of Delegation
     */
    public String getDelegation() {
        return (String) getAttributeInternal(DELEGATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Delegation.
     * @param value value to set the Delegation
     */
    public void setDelegation(String value) {
        setAttributeInternal(DELEGATION, value);
    }

    /**
     * Gets the attribute value for NotesToDelegation, using the alias name NotesToDelegation.
     * @return the value of NotesToDelegation
     */
    public String getNotesToDelegation() {
        return (String) getAttributeInternal(NOTESTODELEGATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for NotesToDelegation.
     * @param value value to set the NotesToDelegation
     */
    public void setNotesToDelegation(String value) {
        setAttributeInternal(NOTESTODELEGATION, value);
    }

    /**
     * Gets the attribute value for Approver, using the alias name Approver.
     * @return the value of Approver
     */
    public String getApprover() {
        return (String) getAttributeInternal(APPROVER);
    }

    /**
     * Sets <code>value</code> as the attribute value for Approver.
     * @param value value to set the Approver
     */
    public void setApprover(String value) {
        setAttributeInternal(APPROVER, value);
    }

    /**
     * Gets the attribute value for NotesApprover, using the alias name NotesApprover.
     * @return the value of NotesApprover
     */
    public String getNotesApprover() {
        return (String) getAttributeInternal(NOTESAPPROVER);
    }

    /**
     * Sets <code>value</code> as the attribute value for NotesApprover.
     * @param value value to set the NotesApprover
     */
    public void setNotesApprover(String value) {
        setAttributeInternal(NOTESAPPROVER, value);
    }

    /**
     * Gets the attribute value for ExitPermit, using the alias name ExitPermit.
     * @return the value of ExitPermit
     */
    public String getExitPermit() {
        return (String) getAttributeInternal(EXITPERMIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExitPermit.
     * @param value value to set the ExitPermit
     */
    public void setExitPermit(String value) {
        setAttributeInternal(EXITPERMIT, value);
    }

    /**
     * Gets the attribute value for Notesremarks, using the alias name Notesremarks.
     * @return the value of Notesremarks
     */
    public String getNotesremarks() {
        return (String) getAttributeInternal(NOTESREMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Notesremarks.
     * @param value value to set the Notesremarks
     */
    public void setNotesremarks(String value) {
        setAttributeInternal(NOTESREMARKS, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> HrLookupTblView1.
     */
    public RowSet getHrLookupTblView1() {
        return (RowSet) getAttributeInternal(HRLOOKUPTBLVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> HrLookupTblView2.
     */
    public RowSet getHrLookupTblView2() {
        return (RowSet) getAttributeInternal(HRLOOKUPTBLVIEW2);
    }

    /**
     * Gets the view accessor <code>RowSet</code> HrLookupTblView3.
     */
    public RowSet getHrLookupTblView3() {
        return (RowSet) getAttributeInternal(HRLOOKUPTBLVIEW3);
    }

    /**
     * @param employeeNo key constituent
     * @param leaveCode key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal employeeNo, String leaveCode) {
        return new Key(new Object[] { employeeNo, leaveCode });
    }


}
