/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.InterestPaymentSchedule1Choice;
import com.tools20022.repository.choice.InterestRate2Choice;
import com.tools20022.repository.choice.PaymentSchedule1Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Exact1NumericText;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Contract by which an amount of money in exchange for future repayment of the
 * principal amount along with interest or other finance charges.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LoanContract1#mmContractDocumentIdentification
 * LoanContract1.mmContractDocumentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#mmBuyer
 * LoanContract1.mmBuyer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#mmSeller
 * LoanContract1.mmSeller}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#mmAmount
 * LoanContract1.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#mmMaturityDate
 * LoanContract1.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LoanContract1#mmProlongationFlag
 * LoanContract1.mmProlongationFlag}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#mmStartDate
 * LoanContract1.mmStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LoanContract1#mmSettlementCurrency
 * LoanContract1.mmSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LoanContract1#mmSpecialConditions
 * LoanContract1.mmSpecialConditions}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#mmDurationCode
 * LoanContract1.mmDurationCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#mmInterestRate
 * LoanContract1.mmInterestRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#mmTranche
 * LoanContract1.mmTranche}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LoanContract1#mmPaymentSchedule
 * LoanContract1.mmPaymentSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LoanContract1#mmInterestSchedule
 * LoanContract1.mmInterestSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LoanContract1#mmIntraCompanyLoan
 * LoanContract1.mmIntraCompanyLoan}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#mmCollateral
 * LoanContract1.mmCollateral}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#mmSyndicatedLoan
 * LoanContract1.mmSyndicatedLoan}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#mmAttachment
 * LoanContract1.mmAttachment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Loan Loan}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LoanContract1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Contract by which an amount of money in exchange for future repayment of the principal amount along with interest or other finance charges."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LoanContract1", propOrder = {"contractDocumentIdentification", "buyer", "seller", "amount", "maturityDate", "prolongationFlag", "startDate", "settlementCurrency", "specialConditions", "durationCode", "interestRate",
		"tranche", "paymentSchedule", "interestSchedule", "intraCompanyLoan", "collateral", "syndicatedLoan", "attachment"})
public class LoanContract1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CtrctDocId", required = true)
	protected DocumentIdentification22 contractDocumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22
	 * DocumentIdentification22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctDocId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractDocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract document referenced from this loan agreement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContractDocumentIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "CtrctDocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractDocumentIdentification";
			definition = "Contract document referenced from this loan agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.DocumentIdentification22.mmObject();
		}
	};
	@XmlElement(name = "Buyr", required = true)
	protected List<com.tools20022.repository.msg.TradeParty2> buyer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty2
	 * TradeParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyerRole BuyerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Buyr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is specified as the buyer for this loan agreement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBuyer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> BuyerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Party that is specified as the buyer for this loan agreement.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradeParty2.mmObject();
		}
	};
	@XmlElement(name = "Sellr", required = true)
	protected List<com.tools20022.repository.msg.TradeParty2> seller;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty2
	 * TradeParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SellerRole SellerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sellr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is specified as the seller for this loan agreement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSeller = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SellerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "Sellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Party that is specified as the seller for this loan agreement.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradeParty2.mmObject();
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected ActiveCurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Loan#mmPrincipalAmount
	 * Loan.mmPrincipalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Loan amount as defined in the contract."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Loan.mmPrincipalAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Loan amount as defined in the contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "MtrtyDt", required = true)
	protected ISODate maturityDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Planned final repayment date at the time of issuance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Planned final repayment date at the time of issuance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "PrlngtnFlg", required = true)
	protected TrueFalseIndicator prolongationFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrlngtnFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProlongationFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the contract duration is extended or not."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProlongationFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "PrlngtnFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProlongationFlag";
			definition = "Indicates whether the contract duration is extended or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "StartDt", required = true)
	protected ISODate startDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueDate
	 * Issuance.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Start date of the loan contract."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStartDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "StartDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartDate";
			definition = "Start date of the loan contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "SttlmCcy", required = true)
	protected ActiveCurrencyCode settlementCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionQuotedCurrency
	 * SecuritiesConversion.mmConversionQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which the loan is being settled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionQuotedCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency in which the loan is being settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "SpclConds")
	protected SpecialCondition1 specialConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SpecialCondition1
	 * SpecialCondition1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpclConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the amount is credited outside of the country, special conditions are applicable."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSpecialConditions = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "SpclConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialConditions";
			definition = "When the amount is credited outside of the country, special conditions are applicable.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SpecialCondition1.mmObject();
		}
	};
	@XmlElement(name = "DrtnCd", required = true)
	protected Exact1NumericText durationCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact1NumericText
	 * Exact1NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrtnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DurationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Loan duration in a coded form."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDurationCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "DrtnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DurationCode";
			definition = "Loan duration in a coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact1NumericText.mmObject();
		}
	};
	@XmlElement(name = "IntrstRate", required = true)
	protected InterestRate2Choice interestRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.InterestRate2Choice
	 * InterestRate2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmPercentage
	 * PaymentTerms.mmPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest rate for the loan."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterestRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentTerms.mmPercentage;
			componentContext_lazy = () -> com.tools20022.repository.msg.LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Interest rate for the loan.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InterestRate2Choice.mmObject();
		}
	};
	@XmlElement(name = "Trch")
	protected List<com.tools20022.repository.msg.LoanContractTranche1> tranche;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LoanContractTranche1
	 * LoanContractTranche1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmTranche
	 * Asset.mmTranche}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tranche"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One part or division of the loan, used to define the repayment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTranche = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Asset.mmTranche;
			componentContext_lazy = () -> com.tools20022.repository.msg.LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "Trch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tranche";
			definition = "One part or division of the loan, used to define the repayment.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LoanContractTranche1.mmObject();
		}
	};
	@XmlElement(name = "PmtSchdl")
	protected PaymentSchedule1Choice paymentSchedule;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentSchedule1Choice
	 * PaymentSchedule1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentTerms
	 * PaymentObligation.mmPaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtSchdl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Schedule of the payments defined for the loan contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentSchedule = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPaymentTerms;
			componentContext_lazy = () -> com.tools20022.repository.msg.LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "PmtSchdl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentSchedule";
			definition = "Schedule of the payments defined for the loan contract.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentSchedule1Choice.mmObject();
		}
	};
	@XmlElement(name = "IntrstSchdl", required = true)
	protected InterestPaymentSchedule1Choice interestSchedule;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InterestPaymentSchedule1Choice
	 * InterestPaymentSchedule1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Loan#mmInterestPaymentsSchedule
	 * Loan.mmInterestPaymentsSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstSchdl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Schedule of the interest payments defined for the loan contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterestSchedule = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Loan.mmInterestPaymentsSchedule;
			componentContext_lazy = () -> com.tools20022.repository.msg.LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "IntrstSchdl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestSchedule";
			definition = "Schedule of the interest payments defined for the loan contract.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InterestPaymentSchedule1Choice.mmObject();
		}
	};
	@XmlElement(name = "IntraCpnyLn", required = true)
	protected TrueFalseIndicator intraCompanyLoan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Loan#mmIntraCompanyLoanIndicator
	 * Loan.mmIntraCompanyLoanIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntraCpnyLn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraCompanyLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Loan is an intra company loan."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntraCompanyLoan = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Loan.mmIntraCompanyLoanIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "IntraCpnyLn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraCompanyLoan";
			definition = "Loan is an intra company loan.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "Coll")
	protected ContractCollateral1 collateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContractCollateral1
	 * ContractCollateral1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmCollateral
	 * CollateralAgreement.mmCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Coll"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the collateral for the loan."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCollateral = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CollateralAgreement.mmCollateral;
			componentContext_lazy = () -> com.tools20022.repository.msg.LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "Coll";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Details of the collateral for the loan.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContractCollateral1.mmObject();
		}
	};
	@XmlElement(name = "SndctdLn")
	protected List<com.tools20022.repository.msg.SyndicatedLoan1> syndicatedLoan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SyndicatedLoan1
	 * SyndicatedLoan1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Loan Loan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndctdLn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SyndicatedLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Loan offered by a group of lenders (called a syndicate) who work together to provide funds for a single borrower. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSyndicatedLoan = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Loan.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "SndctdLn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SyndicatedLoan";
			definition = "Loan offered by a group of lenders (called a syndicate) who work together to provide funds for a single borrower. ";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SyndicatedLoan1.mmObject();
		}
	};
	@XmlElement(name = "Attchmnt")
	protected List<com.tools20022.repository.msg.DocumentGeneralInformation3> attachment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3
	 * DocumentGeneralInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmAttachment
	 * RegisteredContract.mmAttachment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LoanContract1 LoanContract1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Attchmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attachment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Documents provided as attachments to the loan contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAttachment = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> RegisteredContract.mmAttachment;
			componentContext_lazy = () -> com.tools20022.repository.msg.LoanContract1.mmObject();
			isDerived = false;
			xmlTag = "Attchmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			definition = "Documents provided as attachments to the loan contract.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentGeneralInformation3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LoanContract1.mmContractDocumentIdentification, com.tools20022.repository.msg.LoanContract1.mmBuyer,
						com.tools20022.repository.msg.LoanContract1.mmSeller, com.tools20022.repository.msg.LoanContract1.mmAmount, com.tools20022.repository.msg.LoanContract1.mmMaturityDate,
						com.tools20022.repository.msg.LoanContract1.mmProlongationFlag, com.tools20022.repository.msg.LoanContract1.mmStartDate, com.tools20022.repository.msg.LoanContract1.mmSettlementCurrency,
						com.tools20022.repository.msg.LoanContract1.mmSpecialConditions, com.tools20022.repository.msg.LoanContract1.mmDurationCode, com.tools20022.repository.msg.LoanContract1.mmInterestRate,
						com.tools20022.repository.msg.LoanContract1.mmTranche, com.tools20022.repository.msg.LoanContract1.mmPaymentSchedule, com.tools20022.repository.msg.LoanContract1.mmInterestSchedule,
						com.tools20022.repository.msg.LoanContract1.mmIntraCompanyLoan, com.tools20022.repository.msg.LoanContract1.mmCollateral, com.tools20022.repository.msg.LoanContract1.mmSyndicatedLoan,
						com.tools20022.repository.msg.LoanContract1.mmAttachment);
				trace_lazy = () -> Loan.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LoanContract1";
				definition = "Contract by which an amount of money in exchange for future repayment of the principal amount along with interest or other finance charges.";
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification22 getContractDocumentIdentification() {
		return contractDocumentIdentification;
	}

	public LoanContract1 setContractDocumentIdentification(com.tools20022.repository.msg.DocumentIdentification22 contractDocumentIdentification) {
		this.contractDocumentIdentification = Objects.requireNonNull(contractDocumentIdentification);
		return this;
	}

	public List<TradeParty2> getBuyer() {
		return buyer == null ? buyer = new ArrayList<>() : buyer;
	}

	public LoanContract1 setBuyer(List<com.tools20022.repository.msg.TradeParty2> buyer) {
		this.buyer = Objects.requireNonNull(buyer);
		return this;
	}

	public List<TradeParty2> getSeller() {
		return seller == null ? seller = new ArrayList<>() : seller;
	}

	public LoanContract1 setSeller(List<com.tools20022.repository.msg.TradeParty2> seller) {
		this.seller = Objects.requireNonNull(seller);
		return this;
	}

	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public LoanContract1 setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public ISODate getMaturityDate() {
		return maturityDate;
	}

	public LoanContract1 setMaturityDate(ISODate maturityDate) {
		this.maturityDate = Objects.requireNonNull(maturityDate);
		return this;
	}

	public TrueFalseIndicator getProlongationFlag() {
		return prolongationFlag;
	}

	public LoanContract1 setProlongationFlag(TrueFalseIndicator prolongationFlag) {
		this.prolongationFlag = Objects.requireNonNull(prolongationFlag);
		return this;
	}

	public ISODate getStartDate() {
		return startDate;
	}

	public LoanContract1 setStartDate(ISODate startDate) {
		this.startDate = Objects.requireNonNull(startDate);
		return this;
	}

	public ActiveCurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public LoanContract1 setSettlementCurrency(ActiveCurrencyCode settlementCurrency) {
		this.settlementCurrency = Objects.requireNonNull(settlementCurrency);
		return this;
	}

	public Optional<SpecialCondition1> getSpecialConditions() {
		return specialConditions == null ? Optional.empty() : Optional.of(specialConditions);
	}

	public LoanContract1 setSpecialConditions(com.tools20022.repository.msg.SpecialCondition1 specialConditions) {
		this.specialConditions = specialConditions;
		return this;
	}

	public Exact1NumericText getDurationCode() {
		return durationCode;
	}

	public LoanContract1 setDurationCode(Exact1NumericText durationCode) {
		this.durationCode = Objects.requireNonNull(durationCode);
		return this;
	}

	public InterestRate2Choice getInterestRate() {
		return interestRate;
	}

	public LoanContract1 setInterestRate(InterestRate2Choice interestRate) {
		this.interestRate = Objects.requireNonNull(interestRate);
		return this;
	}

	public List<LoanContractTranche1> getTranche() {
		return tranche == null ? tranche = new ArrayList<>() : tranche;
	}

	public LoanContract1 setTranche(List<com.tools20022.repository.msg.LoanContractTranche1> tranche) {
		this.tranche = Objects.requireNonNull(tranche);
		return this;
	}

	public Optional<PaymentSchedule1Choice> getPaymentSchedule() {
		return paymentSchedule == null ? Optional.empty() : Optional.of(paymentSchedule);
	}

	public LoanContract1 setPaymentSchedule(PaymentSchedule1Choice paymentSchedule) {
		this.paymentSchedule = paymentSchedule;
		return this;
	}

	public InterestPaymentSchedule1Choice getInterestSchedule() {
		return interestSchedule;
	}

	public LoanContract1 setInterestSchedule(InterestPaymentSchedule1Choice interestSchedule) {
		this.interestSchedule = Objects.requireNonNull(interestSchedule);
		return this;
	}

	public TrueFalseIndicator getIntraCompanyLoan() {
		return intraCompanyLoan;
	}

	public LoanContract1 setIntraCompanyLoan(TrueFalseIndicator intraCompanyLoan) {
		this.intraCompanyLoan = Objects.requireNonNull(intraCompanyLoan);
		return this;
	}

	public Optional<ContractCollateral1> getCollateral() {
		return collateral == null ? Optional.empty() : Optional.of(collateral);
	}

	public LoanContract1 setCollateral(com.tools20022.repository.msg.ContractCollateral1 collateral) {
		this.collateral = collateral;
		return this;
	}

	public List<SyndicatedLoan1> getSyndicatedLoan() {
		return syndicatedLoan == null ? syndicatedLoan = new ArrayList<>() : syndicatedLoan;
	}

	public LoanContract1 setSyndicatedLoan(List<com.tools20022.repository.msg.SyndicatedLoan1> syndicatedLoan) {
		this.syndicatedLoan = Objects.requireNonNull(syndicatedLoan);
		return this;
	}

	public List<DocumentGeneralInformation3> getAttachment() {
		return attachment == null ? attachment = new ArrayList<>() : attachment;
	}

	public LoanContract1 setAttachment(List<com.tools20022.repository.msg.DocumentGeneralInformation3> attachment) {
		this.attachment = Objects.requireNonNull(attachment);
		return this;
	}
}