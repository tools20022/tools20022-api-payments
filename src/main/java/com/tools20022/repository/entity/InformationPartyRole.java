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
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Role;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Role played by a party as source of information.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InformationPartyRole" src="doc-files/InformationPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#GenericIdentification
 * InformationPartyRole.GenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#HaircutValuation
 * InformationPartyRole.HaircutValuation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InformationPartyRole#Price
 * InformationPartyRole.Price}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InformationPartyRole#Scheme
 * InformationPartyRole.Scheme}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InformationPartyRole#Quote
 * InformationPartyRole.Quote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#TreasuryTrade
 * InformationPartyRole.TreasuryTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#PartyRole
 * GenericIdentification.PartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#InformationPartyRole
 * SecuritiesPricing.InformationPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#InformationPartyRole
 * Scheme.InformationPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTrade#InformationPartyRole
 * TreasuryTrade.InformationPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.HaircutValuation#PartyRole
 * HaircutValuation.PartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#PartyRole
 * Quote.PartyRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.IdentificationIssuerRole
 * IdentificationIssuerRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SourceOfPrice SourceOfPrice}
 * </li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
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
 * "InformationPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Role played by a party as source of information."</li>
 * </ul>
 */
public class InformationPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the identification for which a party plays the issuer role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#PartyRole
	 * GenericIdentification.PartyRole}</li>
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
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the identification for which a party plays the issuer role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd GenericIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InformationPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GenericIdentification";
			definition = "Specifies the identification for which a party plays the issuer role.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.PartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the haircut valuation for which a party provides the
	 * information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation#PartyRole
	 * HaircutValuation.PartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.HaircutValuation
	 * HaircutValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HaircutValuation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the haircut valuation for which a party provides the information."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd HaircutValuation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InformationPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HaircutValuation";
			definition = "Specifies the haircut valuation for which a party provides the information.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.HaircutValuation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.HaircutValuation.PartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the security price for which a party plays a role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#InformationPartyRole
	 * SecuritiesPricing.InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the security price for which a party plays a role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Price = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InformationPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Specifies the security price for which a party plays a role.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.InformationPartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Scheme for which the party is the source.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Scheme#InformationPartyRole
	 * Scheme.InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Scheme Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme for which the party is the source."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Scheme = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InformationPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Scheme";
			definition = "Scheme for which the party is the source.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Scheme.InformationPartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quoting process in which an information party plays a role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Quote#PartyRole
	 * Quote.PartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quoting process in which an information party plays a role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Quote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InformationPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quote";
			definition = "Quoting process in which an information party plays a role.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.PartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade for which a quote is provided.<br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTrade#InformationPartyRole
	 * TreasuryTrade.InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TreasuryTrade
	 * TreasuryTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade for which a quote is provided.\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TreasuryTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InformationPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TreasuryTrade";
			definition = "Trade for which a quote is provided.\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.InformationPartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InformationPartyRole";
				definition = "Role played by a party as source of information.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.PartyRole, com.tools20022.repository.entity.SecuritiesPricing.InformationPartyRole,
						com.tools20022.repository.entity.Scheme.InformationPartyRole, com.tools20022.repository.entity.TreasuryTrade.InformationPartyRole, com.tools20022.repository.entity.HaircutValuation.PartyRole,
						com.tools20022.repository.entity.Quote.PartyRole);
				subType_lazy = () -> Arrays.asList(IdentificationIssuerRole.mmObject(), SourceOfPrice.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InformationPartyRole.GenericIdentification, com.tools20022.repository.entity.InformationPartyRole.HaircutValuation,
						com.tools20022.repository.entity.InformationPartyRole.Price, com.tools20022.repository.entity.InformationPartyRole.Scheme, com.tools20022.repository.entity.InformationPartyRole.Quote,
						com.tools20022.repository.entity.InformationPartyRole.TreasuryTrade);
			}
		});
		return mmObject_lazy.get();
	}
}