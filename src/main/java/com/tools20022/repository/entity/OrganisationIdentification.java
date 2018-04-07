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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.CashClearingSystemMember;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.OrganisationName;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique and unambiguous way to identify an organisation.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="OrganisationIdentification"
 * src="doc-files/OrganisationIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
 * OrganisationIdentification.mmBICFI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmAnyBIC
 * OrganisationIdentification.mmAnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmOrganisationName
 * OrganisationIdentification.mmOrganisationName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmOrganisation
 * OrganisationIdentification.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmClearingSystemMemberIdentificationType
 * OrganisationIdentification.mmClearingSystemMemberIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICNonFI
 * OrganisationIdentification.mmBICNonFI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmEANGLN
 * OrganisationIdentification.mmEANGLN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmCHIPSUniversalIdentifier
 * OrganisationIdentification.mmCHIPSUniversalIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmDUNS
 * OrganisationIdentification.mmDUNS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBankPartyIdentification
 * OrganisationIdentification.mmBankPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmMIC
 * OrganisationIdentification.mmMIC}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
 * Organisation.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmOrganisation
 * OrganisationName.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmOrganisationIdentification
 * CashClearingSystemMember.mmOrganisationIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#mmOther
 * FinancialInstitutionIdentification8.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party11Choice#mmOrganisationIdentification
 * Party11Choice.mmOrganisationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryAgent3#mmAgent
 * ProprietaryAgent3.mmAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charges2#mmAgent
 * Charges2.mmAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party10Choice#mmOrganisationIdentification
 * Party10Choice.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party9Choice#mmOrganisationIdentification
 * Party9Choice.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party9Choice#mmFinancialInstitutionIdentification
 * Party9Choice.mmFinancialInstitutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification9#mmOther
 * FinancialInstitutionIdentification9.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party13Choice#mmOrganisationIdentification
 * Party13Choice.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party13Choice#mmFinancialInstitutionIdentification
 * Party13Choice.mmFinancialInstitutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmAccountServicer
 * CashAccountCharacteristics2.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party34Choice#mmOrganisationIdentification
 * Party34Choice.mmOrganisationIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1
 * GenericFinancialIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8
 * FinancialInstitutionIdentification8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BranchData2 BranchData2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OrganisationIdentificationSchemeName1Choice
 * OrganisationIdentificationSchemeName1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1
 * GenericOrganisationIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationIdentification8
 * OrganisationIdentification8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrganisationIdentification7
 * OrganisationIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryAgent3
 * ProprietaryAgent3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification9
 * FinancialInstitutionIdentification9}</li>
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
 * "OrganisationIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique and unambiguous way to identify an organisation."</li>
 * </ul>
 */
public class OrganisationIdentification extends PartyIdentificationInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected BICFIIdentifier bICFI;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICFIIdentifier
	 * BICFIIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#mmBICFI
	 * FinancialInstitutionIdentification8.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification9#mmBICFI
	 * FinancialInstitutionIdentification9.mmBICFI}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BICFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<OrganisationIdentification, BICFIIdentifier> mmBICFI = new MMBusinessAttribute<OrganisationIdentification, BICFIIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstitutionIdentification8.mmBICFI, FinancialInstitutionIdentification9.mmBICFI);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BICFI";
			definition = "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}

		@Override
		public BICFIIdentifier getValue(OrganisationIdentification obj) {
			return obj.getBICFI();
		}

		@Override
		public void setValue(OrganisationIdentification obj, BICFIIdentifier value) {
			obj.setBICFI(value);
		}
	};
	protected AnyBICIdentifier anyBIC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8#mmAnyBIC
	 * OrganisationIdentification8.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification7#mmAnyBIC
	 * OrganisationIdentification7.mmAnyBIC}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<OrganisationIdentification, AnyBICIdentifier> mmAnyBIC = new MMBusinessAttribute<OrganisationIdentification, AnyBICIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(OrganisationIdentification8.mmAnyBIC, OrganisationIdentification7.mmAnyBIC);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AnyBIC";
			definition = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public AnyBICIdentifier getValue(OrganisationIdentification obj) {
			return obj.getAnyBIC();
		}

		@Override
		public void setValue(OrganisationIdentification obj, AnyBICIdentifier value) {
			obj.setAnyBIC(value);
		}
	};
	protected List<com.tools20022.repository.entity.OrganisationName> organisationName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmOrganisation
	 * OrganisationName.mmOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.OrganisationName
	 * OrganisationName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which an organisation is known and which is usually used to identify that organisation. It is derived from the association between PartyIdentificationInformation and PartyName."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<OrganisationIdentification, List<OrganisationName>> mmOrganisationName = new MMBusinessAssociationEnd<OrganisationIdentification, List<OrganisationName>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrganisationName";
			definition = "Name by which an organisation is known and which is usually used to identify that organisation. It is derived from the association between PartyIdentificationInformation and PartyName.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationName.mmOrganisation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationName.mmObject();
		}

		@Override
		public List<OrganisationName> getValue(OrganisationIdentification obj) {
			return obj.getOrganisationName();
		}

		@Override
		public void setValue(OrganisationIdentification obj, List<OrganisationName> value) {
			obj.setOrganisationName(value);
		}
	};
	protected Organisation organisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Organisation
	 * Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Organisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Organisation which is identified"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<OrganisationIdentification, Optional<Organisation>> mmOrganisation = new MMBusinessAssociationEnd<OrganisationIdentification, Optional<Organisation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Organisation";
			definition = "Organisation which is identified";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.mmOrganisationIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
		}

		@Override
		public Optional<Organisation> getValue(OrganisationIdentification obj) {
			return obj.getOrganisation();
		}

		@Override
		public void setValue(OrganisationIdentification obj, Optional<Organisation> value) {
			obj.setOrganisation(value.orElse(null));
		}
	};
	protected List<CashClearingSystemMember> clearingSystemMemberIdentificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmOrganisationIdentification
	 * CashClearingSystemMember.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification8#mmClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification8.mmClearingSystemMemberIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification9#mmClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification9.mmClearingSystemMemberIdentification}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemMemberIdentificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<OrganisationIdentification, List<CashClearingSystemMember>> mmClearingSystemMemberIdentificationType = new MMBusinessAssociationEnd<OrganisationIdentification, List<CashClearingSystemMember>>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstitutionIdentification8.mmClearingSystemMemberIdentification, FinancialInstitutionIdentification9.mmClearingSystemMemberIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemMemberIdentificationType";
			definition = "Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator.";
			minOccurs = 0;
			opposite_lazy = () -> CashClearingSystemMember.mmOrganisationIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashClearingSystemMember.mmObject();
		}

		@Override
		public List<CashClearingSystemMember> getValue(OrganisationIdentification obj) {
			return obj.getClearingSystemMemberIdentificationType();
		}

		@Override
		public void setValue(OrganisationIdentification obj, List<CashClearingSystemMember> value) {
			obj.setClearingSystemMemberIdentificationType(value);
		}
	};
	protected BICNonFIIdentifier bICNonFI;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICNonFIIdentifier
	 * BICNonFIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BICNonFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a non-financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<OrganisationIdentification, BICNonFIIdentifier> mmBICNonFI = new MMBusinessAttribute<OrganisationIdentification, BICNonFIIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BICNonFI";
			definition = "Code allocated to a non-financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICNonFIIdentifier.mmObject();
		}

		@Override
		public BICNonFIIdentifier getValue(OrganisationIdentification obj) {
			return obj.getBICNonFI();
		}

		@Override
		public void setValue(OrganisationIdentification obj, BICNonFIIdentifier value) {
			obj.setBICNonFI(value);
		}
	};
	protected EANGLNIdentifier eANGLN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.EANGLNIdentifier
	 * EANGLNIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EANGLN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Global Location Number. A non-significant reference number used to identify legal entities, functional entities, or physical entities according to the European Association for Numbering (EAN) numbering scheme rules. The number is used to retrieve detailed information that is linked to it."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<OrganisationIdentification, EANGLNIdentifier> mmEANGLN = new MMBusinessAttribute<OrganisationIdentification, EANGLNIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EANGLN";
			definition = "Global Location Number. A non-significant reference number used to identify legal entities, functional entities, or physical entities according to the European Association for Numbering (EAN) numbering scheme rules. The number is used to retrieve detailed information that is linked to it.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EANGLNIdentifier.mmObject();
		}

		@Override
		public EANGLNIdentifier getValue(OrganisationIdentification obj) {
			return obj.getEANGLN();
		}

		@Override
		public void setValue(OrganisationIdentification obj, EANGLNIdentifier value) {
			obj.setEANGLN(value);
		}
	};
	protected CHIPSUniversalIdentifier cHIPSUniversalIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CHIPSUniversalIdentifier
	 * CHIPSUniversalIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSUniversalIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID). Identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<OrganisationIdentification, com.tools20022.repository.datatype.CHIPSUniversalIdentifier> mmCHIPSUniversalIdentifier = new MMBusinessAttribute<OrganisationIdentification, com.tools20022.repository.datatype.CHIPSUniversalIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CHIPSUniversalIdentifier";
			definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID). Identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> com.tools20022.repository.datatype.CHIPSUniversalIdentifier.mmObject();
		}

		@Override
		public com.tools20022.repository.datatype.CHIPSUniversalIdentifier getValue(OrganisationIdentification obj) {
			return obj.getCHIPSUniversalIdentifier();
		}

		@Override
		public void setValue(OrganisationIdentification obj, com.tools20022.repository.datatype.CHIPSUniversalIdentifier value) {
			obj.setCHIPSUniversalIdentifier(value);
		}
	};
	protected DunsIdentifier dUNS;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DunsIdentifier
	 * DunsIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DUNS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data Universal Numbering System. A unique identification number provided by Dun &amp; Bradstreet to identify an organization."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<OrganisationIdentification, DunsIdentifier> mmDUNS = new MMBusinessAttribute<OrganisationIdentification, DunsIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DUNS";
			definition = "Data Universal Numbering System. A unique identification number provided by Dun & Bradstreet to identify an organization.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DunsIdentifier.mmObject();
		}

		@Override
		public DunsIdentifier getValue(OrganisationIdentification obj) {
			return obj.getDUNS();
		}

		@Override
		public void setValue(OrganisationIdentification obj, DunsIdentifier value) {
			obj.setDUNS(value);
		}
	};
	protected Max35Text bankPartyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankPartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous assignment made by a specific bank to identify a relationship as defined between the bank and its client."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<OrganisationIdentification, Max35Text> mmBankPartyIdentification = new MMBusinessAttribute<OrganisationIdentification, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankPartyIdentification";
			definition = "Unique and unambiguous assignment made by a specific bank to identify a relationship as defined between the bank and its client.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OrganisationIdentification obj) {
			return obj.getBankPartyIdentification();
		}

		@Override
		public void setValue(OrganisationIdentification obj, Max35Text value) {
			obj.setBankPartyIdentification(value);
		}
	};
	protected MICIdentifier mIC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market Identifier Code. Identification of a financial market, as stipulated in the norm ISO 10383 \"Codes for exchanges and market identifications\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<OrganisationIdentification, MICIdentifier> mmMIC = new MMBusinessAttribute<OrganisationIdentification, MICIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MIC";
			definition = "Market Identifier Code. Identification of a financial market, as stipulated in the norm ISO 10383 \"Codes for exchanges and market identifications\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}

		@Override
		public MICIdentifier getValue(OrganisationIdentification obj) {
			return obj.getMIC();
		}

		@Override
		public void setValue(OrganisationIdentification obj, MICIdentifier value) {
			obj.setMIC(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrganisationIdentification";
				definition = "Unique and unambiguous way to identify an organisation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.mmOrganisationIdentification, com.tools20022.repository.entity.OrganisationName.mmOrganisation,
						CashClearingSystemMember.mmOrganisationIdentification);
				derivationElement_lazy = () -> Arrays.asList(FinancialInstitutionIdentification8.mmOther, Party11Choice.mmOrganisationIdentification, ProprietaryAgent3.mmAgent, Charges2.mmAgent, Party10Choice.mmOrganisationIdentification,
						Party9Choice.mmOrganisationIdentification, Party9Choice.mmFinancialInstitutionIdentification, FinancialInstitutionIdentification9.mmOther, Party13Choice.mmOrganisationIdentification,
						Party13Choice.mmFinancialInstitutionIdentification, CashAccountCharacteristics2.mmAccountServicer, Party34Choice.mmOrganisationIdentification);
				superType_lazy = () -> PartyIdentificationInformation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OrganisationIdentification.mmBICFI, com.tools20022.repository.entity.OrganisationIdentification.mmAnyBIC,
						com.tools20022.repository.entity.OrganisationIdentification.mmOrganisationName, com.tools20022.repository.entity.OrganisationIdentification.mmOrganisation,
						com.tools20022.repository.entity.OrganisationIdentification.mmClearingSystemMemberIdentificationType, com.tools20022.repository.entity.OrganisationIdentification.mmBICNonFI,
						com.tools20022.repository.entity.OrganisationIdentification.mmEANGLN, com.tools20022.repository.entity.OrganisationIdentification.mmCHIPSUniversalIdentifier,
						com.tools20022.repository.entity.OrganisationIdentification.mmDUNS, com.tools20022.repository.entity.OrganisationIdentification.mmBankPartyIdentification,
						com.tools20022.repository.entity.OrganisationIdentification.mmMIC);
				derivationComponent_lazy = () -> Arrays.asList(GenericFinancialIdentification1.mmObject(), FinancialInstitutionIdentification8.mmObject(), BranchData2.mmObject(), OrganisationIdentificationSchemeName1Choice.mmObject(),
						GenericOrganisationIdentification1.mmObject(), OrganisationIdentification8.mmObject(), OrganisationIdentification7.mmObject(), ProprietaryAgent3.mmObject(), FinancialInstitutionIdentification9.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return OrganisationIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public BICFIIdentifier getBICFI() {
		return bICFI;
	}

	public OrganisationIdentification setBICFI(BICFIIdentifier bICFI) {
		this.bICFI = Objects.requireNonNull(bICFI);
		return this;
	}

	public AnyBICIdentifier getAnyBIC() {
		return anyBIC;
	}

	public OrganisationIdentification setAnyBIC(AnyBICIdentifier anyBIC) {
		this.anyBIC = Objects.requireNonNull(anyBIC);
		return this;
	}

	public List<OrganisationName> getOrganisationName() {
		return organisationName == null ? organisationName = new ArrayList<>() : organisationName;
	}

	public OrganisationIdentification setOrganisationName(List<com.tools20022.repository.entity.OrganisationName> organisationName) {
		this.organisationName = Objects.requireNonNull(organisationName);
		return this;
	}

	public Optional<Organisation> getOrganisation() {
		return organisation == null ? Optional.empty() : Optional.of(organisation);
	}

	public OrganisationIdentification setOrganisation(com.tools20022.repository.entity.Organisation organisation) {
		this.organisation = organisation;
		return this;
	}

	public List<CashClearingSystemMember> getClearingSystemMemberIdentificationType() {
		return clearingSystemMemberIdentificationType == null ? clearingSystemMemberIdentificationType = new ArrayList<>() : clearingSystemMemberIdentificationType;
	}

	public OrganisationIdentification setClearingSystemMemberIdentificationType(List<CashClearingSystemMember> clearingSystemMemberIdentificationType) {
		this.clearingSystemMemberIdentificationType = Objects.requireNonNull(clearingSystemMemberIdentificationType);
		return this;
	}

	public BICNonFIIdentifier getBICNonFI() {
		return bICNonFI;
	}

	public OrganisationIdentification setBICNonFI(BICNonFIIdentifier bICNonFI) {
		this.bICNonFI = Objects.requireNonNull(bICNonFI);
		return this;
	}

	public EANGLNIdentifier getEANGLN() {
		return eANGLN;
	}

	public OrganisationIdentification setEANGLN(EANGLNIdentifier eANGLN) {
		this.eANGLN = Objects.requireNonNull(eANGLN);
		return this;
	}

	public CHIPSUniversalIdentifier getCHIPSUniversalIdentifier() {
		return cHIPSUniversalIdentifier;
	}

	public OrganisationIdentification setCHIPSUniversalIdentifier(com.tools20022.repository.datatype.CHIPSUniversalIdentifier cHIPSUniversalIdentifier) {
		this.cHIPSUniversalIdentifier = Objects.requireNonNull(cHIPSUniversalIdentifier);
		return this;
	}

	public DunsIdentifier getDUNS() {
		return dUNS;
	}

	public OrganisationIdentification setDUNS(DunsIdentifier dUNS) {
		this.dUNS = Objects.requireNonNull(dUNS);
		return this;
	}

	public Max35Text getBankPartyIdentification() {
		return bankPartyIdentification;
	}

	public OrganisationIdentification setBankPartyIdentification(Max35Text bankPartyIdentification) {
		this.bankPartyIdentification = Objects.requireNonNull(bankPartyIdentification);
		return this;
	}

	public MICIdentifier getMIC() {
		return mIC;
	}

	public OrganisationIdentification setMIC(MICIdentifier mIC) {
		this.mIC = Objects.requireNonNull(mIC);
		return this;
	}
}