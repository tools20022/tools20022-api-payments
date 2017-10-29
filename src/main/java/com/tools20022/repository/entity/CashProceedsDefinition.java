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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.PaymentCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.ProceedsDefinition;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Definition of the cash proceeds for a corporate action in generic terms; that
 * is, before applying it to specific securities holding. An example would be
 * the definition of a dividend payment where all the information will be given
 * in general on a per share basis.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashProceedsDefinition"
 * src="doc-files/CashProceedsDefinition.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#CashIncentiveRate
 * CashProceedsDefinition.CashIncentiveRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#ContractualPaymentIndicator
 * CashProceedsDefinition.ContractualPaymentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#IncomeType
 * CashProceedsDefinition.IncomeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#IndemnityAmount
 * CashProceedsDefinition.IndemnityAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#CashIncentiveAmount
 * CashProceedsDefinition.CashIncentiveAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#PrincipalOrCorpus
 * CashProceedsDefinition.PrincipalOrCorpus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#RedemptionPremiumAmount
 * CashProceedsDefinition.RedemptionPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#IncomePortion
 * CashProceedsDefinition.IncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#Interest
 * CashProceedsDefinition.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#Amount
 * CashProceedsDefinition.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#Dividend
 * CashProceedsDefinition.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#PaymentCurrency
 * CashProceedsDefinition.PaymentCurrency}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForCashProceedsIncome
 * GenericIdentification.IdentificationForCashProceedsIncome}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#CashProceeds
 * Dividend.CashProceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedCashProceedsDefinition
 * Interest.RelatedCashProceedsDefinition}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ProceedsDefinition
 * ProceedsDefinition}</li>
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
 * "CashProceedsDefinition"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Definition of the cash proceeds for a corporate action in generic terms; that is, before applying it to specific securities holding. An example would be the definition of a dividend payment where all the information will be given in general on a per share basis."
 * </li>
 * </ul>
 */
public class CashProceedsDefinition extends ProceedsDefinition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash premium made available if the securities holder consents or
	 * participates to an event, e.g. consent fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashIncentiveRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash premium made available if the securities holder consents or participates to an event, e.g. consent fees."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashIncentiveRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashIncentiveRate";
			definition = "Cash premium made available if the securities holder consents or participates to an event, e.g. consent fees.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Indicates exceptions to contractual payment service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PaymentCode
	 * PaymentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractualPaymentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates exceptions to contractual payment service."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ContractualPaymentIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContractualPaymentIndicator";
			definition = "Indicates exceptions to contractual payment service.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PaymentCode.mmObject();
		}
	};
	/**
	 * Specifies the type of income.<br>
	 * The lists of income type codes to be used, are available on the SMPG
	 * website at www.smpg.info.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForCashProceedsIncome
	 * GenericIdentification.IdentificationForCashProceedsIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of income.\r\nThe lists of income type codes to be used, are available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IncomeType = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncomeType";
			definition = "Specifies the type of income.\r\nThe lists of income type codes to be used, are available on the SMPG website at www.smpg.info.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForCashProceedsIncome;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * (Unique to France) Amount due to a buyer of securities dealt prior to ex
	 * date which may be subject to different rate of taxation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndemnityAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(Unique to France) Amount due to a buyer of securities dealt prior to ex date which may be subject to different rate of taxation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IndemnityAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndemnityAmount";
			definition = "(Unique to France) Amount due to a buyer of securities dealt prior to ex date which may be subject to different rate of taxation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Rate of the cash premium made available if the securities holder consents
	 * or participates to an event, e.g. consent fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashIncentiveAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of the cash premium made available if the securities holder consents or participates to an event, e.g. consent fees."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashIncentiveAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashIncentiveAmount";
			definition = "Rate of the cash premium made available if the securities holder consents or participates to an event, e.g. consent fees.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money representing a distribution of a bond's principal, eg,
	 * repayment of outstanding debt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalOrCorpus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money representing a distribution of a bond's principal, eg, repayment of outstanding debt."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PrincipalOrCorpus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrincipalOrCorpus";
			definition = "Amount of money representing a distribution of a bond's principal, eg, repayment of outstanding debt.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money (not interest) in addition to the principal at the
	 * redemption of a bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionPremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money (not interest) in addition to the principal at the redemption of a bond."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RedemptionPremiumAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionPremiumAmount";
			definition = "Amount of money (not interest) in addition to the principal at the redemption of a bond.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount relating to the underlying security for which income is
	 * distributed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePortion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount relating to the underlying security for which income is distributed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IncomePortion = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncomePortion";
			definition = "Amount relating to the underlying security for which income is distributed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Interest paid as the proceeds of a CA event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#RelatedCashProceedsDefinition
	 * Interest.RelatedCashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest paid as the proceeds of a CA event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest paid as the proceeds of a CA event.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.RelatedCashProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash amount which is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash amount which is posted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Cash amount which is posted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Distribution of earnings to shareholders, paid for in cash, stock, scrip
	 * issue or, rarely, in kind, eg, company products or property. The dividend
	 * amount is decided by the board of directors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#CashProceeds
	 * Dividend.CashProceeds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution of earnings to shareholders, paid for in cash, stock, scrip issue or, rarely, in kind, eg, company products or property. The dividend amount is decided by the board of directors."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Dividend = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Distribution of earnings to shareholders, paid for in cash, stock, scrip issue or, rarely, in kind, eg, company products or property. The dividend amount is decided by the board of directors.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.CashProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency for the payment of the cash proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency for the payment of the cash proceeds."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PaymentCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashProceedsDefinition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentCurrency";
			definition = "Currency for the payment of the cash proceeds.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashProceedsDefinition";
				definition = "Definition of the cash proceeds for a corporate action in generic terms; that is, before applying it to specific securities holding. An example would be the definition of a dividend payment where all the information will be given in general on a per share basis.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentificationForCashProceedsIncome, com.tools20022.repository.entity.Dividend.CashProceeds,
						com.tools20022.repository.entity.Interest.RelatedCashProceedsDefinition);
				superType_lazy = () -> ProceedsDefinition.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashProceedsDefinition.CashIncentiveRate, com.tools20022.repository.entity.CashProceedsDefinition.ContractualPaymentIndicator,
						com.tools20022.repository.entity.CashProceedsDefinition.IncomeType, com.tools20022.repository.entity.CashProceedsDefinition.IndemnityAmount,
						com.tools20022.repository.entity.CashProceedsDefinition.CashIncentiveAmount, com.tools20022.repository.entity.CashProceedsDefinition.PrincipalOrCorpus,
						com.tools20022.repository.entity.CashProceedsDefinition.RedemptionPremiumAmount, com.tools20022.repository.entity.CashProceedsDefinition.IncomePortion,
						com.tools20022.repository.entity.CashProceedsDefinition.Interest, com.tools20022.repository.entity.CashProceedsDefinition.Amount, com.tools20022.repository.entity.CashProceedsDefinition.Dividend,
						com.tools20022.repository.entity.CashProceedsDefinition.PaymentCurrency);
			}
		});
		return mmObject_lazy.get();
	}
}