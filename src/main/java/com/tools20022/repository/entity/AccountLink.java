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
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines the link between the accounts held with a market infrastructure.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AccountLink" src="doc-files/AccountLink.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AccountLink#CashAccount
 * AccountLink.CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountLink#ValidityPeriod
 * AccountLink.ValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#SecuritiesAccount
 * AccountLink.SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#MarketInfrastructure
 * AccountLink.MarketInfrastructure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#CashSettlementIndicator
 * AccountLink.CashSettlementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#CollateralisationIndicator
 * AccountLink.CollateralisationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#DefaultIndicator
 * AccountLink.DefaultIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#AccountLink
 * CashAccount.AccountLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedAccountLink
 * DateTimePeriod.RelatedAccountLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#AccountLink
 * SecuritiesAccount.AccountLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarketInfrastructure#AccountLink
 * MarketInfrastructure.AccountLink}</li>
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
 * "AccountLink"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the link between the accounts held with a market infrastructure."</li>
 * </ul>
 */
public class AccountLink {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash account linked to a securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#AccountLink
	 * CashAccount.AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account linked to a securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AccountLink.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account linked to a securities account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.AccountLink;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Defines the period when the securities account is linked to the cash
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedAccountLink
	 * DateTimePeriod.RelatedAccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the period when the securities account is linked to the cash account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AccountLink.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Defines the period when the securities account is linked to the cash account.";
			minOccurs = 0;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedAccountLink;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities account linked to a cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#AccountLink
	 * SecuritiesAccount.AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities account linked to a cash account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AccountLink.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Securities account linked to a cash account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.AccountLink;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the market infrastructure where the accounts are held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarketInfrastructure#AccountLink
	 * MarketInfrastructure.AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.MarketInfrastructure
	 * MarketInfrastructure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketInfrastructure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the market infrastructure where the accounts are held."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MarketInfrastructure = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AccountLink.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketInfrastructure";
			definition = "Specifies the market infrastructure where the accounts are held.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.MarketInfrastructure.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MarketInfrastructure.AccountLink;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether market infrastructure can use the link between the
	 * securities account and the market infrastructure dedicated cash account
	 * for the settlement of the cash leg of a settlement instruction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether market infrastructure can use the link between the securities account and the market infrastructure dedicated cash account for the settlement of the cash leg of a settlement instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashSettlementIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AccountLink.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashSettlementIndicator";
			definition = "Specifies whether market infrastructure can use the link between the securities account and the market infrastructure dedicated cash account for the settlement of the cash leg of a settlement instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether market infrastructure can use the securities, earmarked
	 * as collateral and held on the securities account, for
	 * auto-collateralisation operations on the linked market infrastructure
	 * dedicated cash account.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether market infrastructure can use the securities, earmarked as collateral and held on the securities account, for auto-collateralisation operations on the linked market infrastructure dedicated cash account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CollateralisationIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AccountLink.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisationIndicator";
			definition = "Specifies whether market infrastructure can use the securities, earmarked as collateral and held on the securities account, for auto-collateralisation operations on the linked market infrastructure dedicated cash account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether created account link is set as default for settlement.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.AccountLink AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether created account link is set as default for settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DefaultIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AccountLink.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultIndicator";
			definition = "Specifies whether created account link is set as default for settlement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountLink";
				definition = "Defines the link between the accounts held with a market infrastructure.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.AccountLink, com.tools20022.repository.entity.DateTimePeriod.RelatedAccountLink,
						com.tools20022.repository.entity.SecuritiesAccount.AccountLink, com.tools20022.repository.entity.MarketInfrastructure.AccountLink);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountLink.CashAccount, com.tools20022.repository.entity.AccountLink.ValidityPeriod, com.tools20022.repository.entity.AccountLink.SecuritiesAccount,
						com.tools20022.repository.entity.AccountLink.MarketInfrastructure, com.tools20022.repository.entity.AccountLink.CashSettlementIndicator, com.tools20022.repository.entity.AccountLink.CollateralisationIndicator,
						com.tools20022.repository.entity.AccountLink.DefaultIndicator);
			}
		});
		return mmObject_lazy.get();
	}
}