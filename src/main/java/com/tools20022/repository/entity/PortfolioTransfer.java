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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.ISATypeCode;
import com.tools20022.repository.codeset.PEPISACode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Transfer by the delivering account servicer to the receiving account servicer
 * of a retail or institutional client portfolio. A portfolio can be any
 * grouping of investments, for example stocks, bonds, options, warrants. held
 * by an institution or an individual.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PortfolioTransfer" src="doc-files/PortfolioTransfer.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredYear
 * PortfolioTransfer.mmTransferredYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmCashComponentIndicator
 * PortfolioTransfer.mmCashComponentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmAccountFrom
 * PortfolioTransfer.mmAccountFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmAccountTo
 * PortfolioTransfer.mmAccountTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmPaymentObligation
 * PortfolioTransfer.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredPortfolio
 * PortfolioTransfer.mmTransferredPortfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmSecuritiesDeliveryObligation
 * PortfolioTransfer.mmSecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredAmount
 * PortfolioTransfer.mmTransferredAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredPercentage
 * PortfolioTransfer.mmTransferredPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferDate
 * PortfolioTransfer.mmTransferDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmNomineeAccount
 * PortfolioTransfer.mmNomineeAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmPEPOrISAPlan
 * PortfolioTransfer.mmPEPOrISAPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmCurrentYearISAType
 * PortfolioTransfer.mmCurrentYearISAType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmDebitPortfolioTransfer
 * InvestmentAccount.mmDebitPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCreditPortfolioTransfer
 * InvestmentAccount.mmCreditPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmRelatedPortfolioTransfer
 * InvestmentAccount.mmRelatedPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourcePortfolioTransfer
 * PaymentObligation.mmPaymentSourcePortfolioTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#mmTransfer
 * Portfolio.mmTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmRelatedPortfolioTransfer
 * SecuritiesDeliveryObligation.mmRelatedPortfolioTransfer}</li>
 * </ul>
 * </li>
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
 * "PortfolioTransfer"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transfer by the delivering account servicer to the receiving account servicer of a retail or institutional client portfolio. A portfolio can be any grouping of  investments, for example  stocks, bonds, options, warrants. held by an institution or an individual."
 * </li>
 * </ul>
 */
public class PortfolioTransfer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISOYear transferredYear;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOYear
	 * ISOYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferredYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the year during which the investment plan to be transferred was issued."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransferredYear = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferredYear";
			definition = "Specifies the year during which the investment plan to be transferred was issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYear.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioTransfer.class.getMethod("getTransferredYear", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator cashComponentIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashComponentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an ISA investment plan contains a cash component asset for transfer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCashComponentIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashComponentIndicator";
			definition = "Indicates whether an ISA investment plan contains a cash component asset for transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioTransfer.class.getMethod("getCashComponentIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccount> accountFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmDebitPortfolioTransfer
	 * InvestmentAccount.mmDebitPortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account owned by an investor and from which the assets are transferred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccountFrom = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountFrom";
			definition = "Specifies the account owned by an investor and from which the assets are transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmDebitPortfolioTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccount> accountTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCreditPortfolioTransfer
	 * InvestmentAccount.mmCreditPortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account owned by an investor and to which the assets are transferred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccountTo = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountTo";
			definition = "Specifies the account owned by an investor and to which the assets are transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmCreditPortfolioTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentObligation> paymentObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourcePortfolioTransfer
	 * PaymentObligation.mmPaymentSourcePortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash amount to be transferred in relation with a portfolio transfer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Specifies the cash amount to be transferred in relation with a portfolio transfer.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmPaymentSourcePortfolioTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Portfolio> transferredPortfolio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#mmTransfer
	 * Portfolio.mmTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferredPortfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the portfolio which has to be transferred."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTransferredPortfolio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferredPortfolio";
			definition = "Specifies the portfolio which has to be transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.mmTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesDeliveryObligation> securitiesDeliveryObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmRelatedPortfolioTransfer
	 * SecuritiesDeliveryObligation.mmRelatedPortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesDeliveryObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the financial instrument to be transferred in relation with a portfolio transfer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesDeliveryObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDeliveryObligation";
			definition = "Specifies the financial instrument to be transferred in relation with a portfolio transfer.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmRelatedPortfolioTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmObject();
		}
	};
	protected CurrencyAndAmount transferredAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferredAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument to transfer expressed as an amount of money."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransferredAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferredAmount";
			definition = "Quantity of financial instrument to transfer expressed as an amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioTransfer.class.getMethod("getTransferredAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate transferredPercentage;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferredPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument to transfer expressed as a percentage of the investor's total holding."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransferredPercentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferredPercentage";
			definition = "Quantity of financial instrument to transfer expressed as a percentage of the investor's total holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioTransfer.class.getMethod("getTransferredPercentage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime transferDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Execution date of the transfer instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransferDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferDate";
			definition = "Execution date of the transfer instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioTransfer.class.getMethod("getTransferDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentAccount nomineeAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmRelatedPortfolioTransfer
	 * InvestmentAccount.mmRelatedPortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NomineeAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account held in the name of a party that is not the name of the beneficial owner of the shares."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNomineeAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NomineeAccount";
			definition = "Account held in the name of a party that is not the name of the beneficial owner of the shares.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmRelatedPortfolioTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	protected PEPISACode pEPOrISAPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PEPISACode
	 * PEPISACode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PEPOrISAPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the investment plan is a PEP or ISA type."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPEPOrISAPlan = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PEPOrISAPlan";
			definition = "Specifies whether the investment plan is a PEP or ISA type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PEPISACode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioTransfer.class.getMethod("getPEPOrISAPlan", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISATypeCode currentYearISAType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ISATypeCode
	 * ISATypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearISAType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Current year ISA is an ISA that was issued during the current fiscal year."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurrentYearISAType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrentYearISAType";
			definition = "Current year ISA is an ISA that was issued during the current fiscal year.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISATypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PortfolioTransfer.class.getMethod("getCurrentYearISAType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PortfolioTransfer";
				definition = "Transfer by the delivering account servicer to the receiving account servicer of a retail or institutional client portfolio. A portfolio can be any grouping of  investments, for example  stocks, bonds, options, warrants. held by an institution or an individual.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.mmDebitPortfolioTransfer, com.tools20022.repository.entity.InvestmentAccount.mmCreditPortfolioTransfer,
						com.tools20022.repository.entity.InvestmentAccount.mmRelatedPortfolioTransfer, com.tools20022.repository.entity.PaymentObligation.mmPaymentSourcePortfolioTransfer,
						com.tools20022.repository.entity.Portfolio.mmTransfer, com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmRelatedPortfolioTransfer);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PortfolioTransfer.mmTransferredYear, com.tools20022.repository.entity.PortfolioTransfer.mmCashComponentIndicator,
						com.tools20022.repository.entity.PortfolioTransfer.mmAccountFrom, com.tools20022.repository.entity.PortfolioTransfer.mmAccountTo, com.tools20022.repository.entity.PortfolioTransfer.mmPaymentObligation,
						com.tools20022.repository.entity.PortfolioTransfer.mmTransferredPortfolio, com.tools20022.repository.entity.PortfolioTransfer.mmSecuritiesDeliveryObligation,
						com.tools20022.repository.entity.PortfolioTransfer.mmTransferredAmount, com.tools20022.repository.entity.PortfolioTransfer.mmTransferredPercentage, com.tools20022.repository.entity.PortfolioTransfer.mmTransferDate,
						com.tools20022.repository.entity.PortfolioTransfer.mmNomineeAccount, com.tools20022.repository.entity.PortfolioTransfer.mmPEPOrISAPlan, com.tools20022.repository.entity.PortfolioTransfer.mmCurrentYearISAType);
			}

			@Override
			public Class<?> getInstanceClass() {
				return PortfolioTransfer.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISOYear getTransferredYear() {
		return transferredYear;
	}

	public PortfolioTransfer setTransferredYear(ISOYear transferredYear) {
		this.transferredYear = Objects.requireNonNull(transferredYear);
		return this;
	}

	public YesNoIndicator getCashComponentIndicator() {
		return cashComponentIndicator;
	}

	public PortfolioTransfer setCashComponentIndicator(YesNoIndicator cashComponentIndicator) {
		this.cashComponentIndicator = Objects.requireNonNull(cashComponentIndicator);
		return this;
	}

	public List<InvestmentAccount> getAccountFrom() {
		return accountFrom == null ? accountFrom = new ArrayList<>() : accountFrom;
	}

	public PortfolioTransfer setAccountFrom(List<com.tools20022.repository.entity.InvestmentAccount> accountFrom) {
		this.accountFrom = Objects.requireNonNull(accountFrom);
		return this;
	}

	public List<InvestmentAccount> getAccountTo() {
		return accountTo == null ? accountTo = new ArrayList<>() : accountTo;
	}

	public PortfolioTransfer setAccountTo(List<com.tools20022.repository.entity.InvestmentAccount> accountTo) {
		this.accountTo = Objects.requireNonNull(accountTo);
		return this;
	}

	public List<PaymentObligation> getPaymentObligation() {
		return paymentObligation == null ? paymentObligation = new ArrayList<>() : paymentObligation;
	}

	public PortfolioTransfer setPaymentObligation(List<com.tools20022.repository.entity.PaymentObligation> paymentObligation) {
		this.paymentObligation = Objects.requireNonNull(paymentObligation);
		return this;
	}

	public List<Portfolio> getTransferredPortfolio() {
		return transferredPortfolio == null ? transferredPortfolio = new ArrayList<>() : transferredPortfolio;
	}

	public PortfolioTransfer setTransferredPortfolio(List<com.tools20022.repository.entity.Portfolio> transferredPortfolio) {
		this.transferredPortfolio = Objects.requireNonNull(transferredPortfolio);
		return this;
	}

	public List<SecuritiesDeliveryObligation> getSecuritiesDeliveryObligation() {
		return securitiesDeliveryObligation == null ? securitiesDeliveryObligation = new ArrayList<>() : securitiesDeliveryObligation;
	}

	public PortfolioTransfer setSecuritiesDeliveryObligation(List<com.tools20022.repository.entity.SecuritiesDeliveryObligation> securitiesDeliveryObligation) {
		this.securitiesDeliveryObligation = Objects.requireNonNull(securitiesDeliveryObligation);
		return this;
	}

	public CurrencyAndAmount getTransferredAmount() {
		return transferredAmount;
	}

	public PortfolioTransfer setTransferredAmount(CurrencyAndAmount transferredAmount) {
		this.transferredAmount = Objects.requireNonNull(transferredAmount);
		return this;
	}

	public PercentageRate getTransferredPercentage() {
		return transferredPercentage;
	}

	public PortfolioTransfer setTransferredPercentage(PercentageRate transferredPercentage) {
		this.transferredPercentage = Objects.requireNonNull(transferredPercentage);
		return this;
	}

	public ISODateTime getTransferDate() {
		return transferDate;
	}

	public PortfolioTransfer setTransferDate(ISODateTime transferDate) {
		this.transferDate = Objects.requireNonNull(transferDate);
		return this;
	}

	public InvestmentAccount getNomineeAccount() {
		return nomineeAccount;
	}

	public PortfolioTransfer setNomineeAccount(com.tools20022.repository.entity.InvestmentAccount nomineeAccount) {
		this.nomineeAccount = Objects.requireNonNull(nomineeAccount);
		return this;
	}

	public PEPISACode getPEPOrISAPlan() {
		return pEPOrISAPlan;
	}

	public PortfolioTransfer setPEPOrISAPlan(PEPISACode pEPOrISAPlan) {
		this.pEPOrISAPlan = Objects.requireNonNull(pEPOrISAPlan);
		return this;
	}

	public ISATypeCode getCurrentYearISAType() {
		return currentYearISAType;
	}

	public PortfolioTransfer setCurrentYearISAType(ISATypeCode currentYearISAType) {
		this.currentYearISAType = Objects.requireNonNull(currentYearISAType);
		return this;
	}
}