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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.IdentificationSource3Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InformationPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity that assigns the identification.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="IdentificationIssuerRole"
 * src="doc-files/IdentificationIssuerRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole#Country
 * IdentificationIssuerRole.Country}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole#EntityName
 * IdentificationIssuerRole.EntityName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole#OwnerCode
 * IdentificationIssuerRole.OwnerCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification1#Issuer
 * GenericIdentification1.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification13#Issuer
 * GenericIdentification13.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification3#Issuer
 * GenericIdentification3.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1#Issuer
 * GenericFinancialIdentification1.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericAccountIdentification1#Issuer
 * GenericAccountIdentification1.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1#Issuer
 * GenericOrganisationIdentification1.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericPersonIdentification1#Issuer
 * GenericPersonIdentification1.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1#Issuer
 * ProprietaryBankTransactionCodeStructure1.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification32#Issuer
 * GenericIdentification32.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification30#Issuer
 * GenericIdentification30.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceCommonIdentification1#Issuer
 * BillingServiceCommonIdentification1.Issuer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
 * InformationPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationSource3Choice
 * IdentificationSource3Choice}</li>
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
 * "IdentificationIssuerRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity that assigns the identification."</li>
 * </ul>
 */
public class IdentificationIssuerRole extends InformationPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Country of the proprietary identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole
	 * IdentificationIssuerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the proprietary identification scheme."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Country = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IdentificationIssuerRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country of the proprietary identification scheme.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	/**
	 * Entity that issues the proprietary identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole
	 * IdentificationIssuerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntityName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity that issues the proprietary identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EntityName = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IdentificationIssuerRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntityName";
			definition = "Entity that issues the proprietary identification.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Code representing the organisation that owns and is responsible of an
	 * enumerated code list, for example ISO.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole
	 * IdentificationIssuerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnerCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code representing the organisation that owns and is responsible of an enumerated code list, for example ISO."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OwnerCode = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IdentificationIssuerRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OwnerCode";
			definition = "Code representing the organisation that owns and is responsible of an enumerated code list, for example ISO.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IdentificationIssuerRole";
				definition = "Entity that assigns the identification.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericIdentification1.Issuer, com.tools20022.repository.msg.GenericIdentification13.Issuer,
						com.tools20022.repository.msg.GenericIdentification3.Issuer, com.tools20022.repository.msg.GenericFinancialIdentification1.Issuer, com.tools20022.repository.msg.GenericAccountIdentification1.Issuer,
						com.tools20022.repository.msg.GenericOrganisationIdentification1.Issuer, com.tools20022.repository.msg.GenericPersonIdentification1.Issuer,
						com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1.Issuer, com.tools20022.repository.msg.GenericIdentification32.Issuer, com.tools20022.repository.msg.GenericIdentification30.Issuer,
						com.tools20022.repository.msg.BillingServiceCommonIdentification1.Issuer);
				superType_lazy = () -> InformationPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IdentificationIssuerRole.Country, com.tools20022.repository.entity.IdentificationIssuerRole.EntityName,
						com.tools20022.repository.entity.IdentificationIssuerRole.OwnerCode);
				derivationComponent_lazy = () -> Arrays.asList(IdentificationSource3Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}