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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.OrganisationLegalStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a legal entity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode#UnlimitedTrust
 * OrganisationLegalStatusCode.UnlimitedTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode#UnlimitedCompany
 * OrganisationLegalStatusCode.UnlimitedCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode#SoleProprietorship
 * OrganisationLegalStatusCode.SoleProprietorship}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode#PublicLimitedCompany
 * OrganisationLegalStatusCode.PublicLimitedCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode#PrivateCompanyLimitedByShares
 * OrganisationLegalStatusCode.PrivateCompanyLimitedByShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode#PrivateCompanyLimitedByGuarantee
 * OrganisationLegalStatusCode.PrivateCompanyLimitedByGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode#LimitedPartnership
 * OrganisationLegalStatusCode.LimitedPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode#LimitedLiabilityPartnership
 * OrganisationLegalStatusCode.LimitedLiabilityPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode#IndustrialAndProvidentSociety
 * OrganisationLegalStatusCode.IndustrialAndProvidentSociety}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode#GeneralPartnership
 * OrganisationLegalStatusCode.GeneralPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode#CommunityInterestCompany
 * OrganisationLegalStatusCode.CommunityInterestCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode#Charity
 * OrganisationLegalStatusCode.Charity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode#CharitableIncorporatedOrganisation
 * OrganisationLegalStatusCode.CharitableIncorporatedOrganisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code
 * OrganisationLegalStatus1Code}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrganisationLegalStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a legal entity."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrganisationLegalStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unlimited trust
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode
	 * OrganisationLegalStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnlimitedTrust"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unlimited trust"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatusCode UnlimitedTrust = new OrganisationLegalStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnlimitedTrust";
			definition = "Unlimited trust";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatusCode.mmObject();
			codeName = "UNLT";
		}
	};
	/**
	 * Unlimited company
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode
	 * OrganisationLegalStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNLC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnlimitedCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unlimited company"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatusCode UnlimitedCompany = new OrganisationLegalStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnlimitedCompany";
			definition = "Unlimited company";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatusCode.mmObject();
			codeName = "UNLC";
		}
	};
	/**
	 * Sole proprietorship/Sole trader
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode
	 * OrganisationLegalStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOLE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoleProprietorship"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sole proprietorship/Sole trader"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatusCode SoleProprietorship = new OrganisationLegalStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoleProprietorship";
			definition = "Sole proprietorship/Sole trader";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatusCode.mmObject();
			codeName = "SOLE";
		}
	};
	/**
	 * Public limited company (Plc.)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode
	 * OrganisationLegalStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCLC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicLimitedCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Public limited company (Plc.)"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatusCode PublicLimitedCompany = new OrganisationLegalStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicLimitedCompany";
			definition = "Public limited company (Plc.)";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatusCode.mmObject();
			codeName = "PCLC";
		}
	};
	/**
	 * Private company limited by shares (Ltd.)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode
	 * OrganisationLegalStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCLS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivateCompanyLimitedByShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Private company limited by shares (Ltd.)"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatusCode PrivateCompanyLimitedByShares = new OrganisationLegalStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivateCompanyLimitedByShares";
			definition = "Private company limited by shares (Ltd.)";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatusCode.mmObject();
			codeName = "PCLS";
		}
	};
	/**
	 * Private company limited by guarantee (Ltd.)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode
	 * OrganisationLegalStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCLG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivateCompanyLimitedByGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Private company limited by guarantee (Ltd.)"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatusCode PrivateCompanyLimitedByGuarantee = new OrganisationLegalStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivateCompanyLimitedByGuarantee";
			definition = "Private company limited by guarantee (Ltd.)";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatusCode.mmObject();
			codeName = "PCLG";
		}
	};
	/**
	 * Limited partnership (LP)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode
	 * OrganisationLegalStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedPartnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limited partnership (LP)"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatusCode LimitedPartnership = new OrganisationLegalStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedPartnership";
			definition = "Limited partnership (LP)";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatusCode.mmObject();
			codeName = "LIMP";
		}
	};
	/**
	 * Limited liability partnership (LLP)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode
	 * OrganisationLegalStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LLPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedLiabilityPartnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limited liability partnership (LLP)"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatusCode LimitedLiabilityPartnership = new OrganisationLegalStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedLiabilityPartnership";
			definition = "Limited liability partnership (LLP)";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatusCode.mmObject();
			codeName = "LLPP";
		}
	};
	/**
	 * For example a co-operative, which does include Ltd. or charity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode
	 * OrganisationLegalStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IAPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndustrialAndProvidentSociety"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For example a co-operative, which does include Ltd. or charity."</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatusCode IndustrialAndProvidentSociety = new OrganisationLegalStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndustrialAndProvidentSociety";
			definition = "For example a co-operative, which does include Ltd. or charity.";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatusCode.mmObject();
			codeName = "IAPS";
		}
	};
	/**
	 * General partnership
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode
	 * OrganisationLegalStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GENP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneralPartnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General partnership"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatusCode GeneralPartnership = new OrganisationLegalStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneralPartnership";
			definition = "General partnership";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatusCode.mmObject();
			codeName = "GENP";
		}
	};
	/**
	 * Community Interest Company (CIC)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode
	 * OrganisationLegalStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CICC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommunityInterestCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Community Interest Company (CIC)"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatusCode CommunityInterestCompany = new OrganisationLegalStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommunityInterestCompany";
			definition = "Community Interest Company (CIC)";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatusCode.mmObject();
			codeName = "CICC";
		}
	};
	/**
	 * Charity
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode
	 * OrganisationLegalStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charity"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatusCode Charity = new OrganisationLegalStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charity";
			definition = "Charity";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatusCode.mmObject();
			codeName = "CHAR";
		}
	};
	/**
	 * Charitable incorporated organisation (CIO)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode
	 * OrganisationLegalStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CIOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CharitableIncorporatedOrganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charitable incorporated organisation (CIO)"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatusCode CharitableIncorporatedOrganisation = new OrganisationLegalStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CharitableIncorporatedOrganisation";
			definition = "Charitable incorporated organisation (CIO)";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatusCode.mmObject();
			codeName = "CIOC";
		}
	};
	final static private LinkedHashMap<String, OrganisationLegalStatusCode> codesByName = new LinkedHashMap<>();

	protected OrganisationLegalStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "OrganisationLegalStatusCode";
				definition = "Specifies the status of a legal entity.";
				derivation_lazy = () -> Arrays.asList(OrganisationLegalStatus1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrganisationLegalStatusCode.UnlimitedTrust, com.tools20022.repository.codeset.OrganisationLegalStatusCode.UnlimitedCompany,
						com.tools20022.repository.codeset.OrganisationLegalStatusCode.SoleProprietorship, com.tools20022.repository.codeset.OrganisationLegalStatusCode.PublicLimitedCompany,
						com.tools20022.repository.codeset.OrganisationLegalStatusCode.PrivateCompanyLimitedByShares, com.tools20022.repository.codeset.OrganisationLegalStatusCode.PrivateCompanyLimitedByGuarantee,
						com.tools20022.repository.codeset.OrganisationLegalStatusCode.LimitedPartnership, com.tools20022.repository.codeset.OrganisationLegalStatusCode.LimitedLiabilityPartnership,
						com.tools20022.repository.codeset.OrganisationLegalStatusCode.IndustrialAndProvidentSociety, com.tools20022.repository.codeset.OrganisationLegalStatusCode.GeneralPartnership,
						com.tools20022.repository.codeset.OrganisationLegalStatusCode.CommunityInterestCompany, com.tools20022.repository.codeset.OrganisationLegalStatusCode.Charity,
						com.tools20022.repository.codeset.OrganisationLegalStatusCode.CharitableIncorporatedOrganisation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UnlimitedTrust.getCodeName().get(), UnlimitedTrust);
		codesByName.put(UnlimitedCompany.getCodeName().get(), UnlimitedCompany);
		codesByName.put(SoleProprietorship.getCodeName().get(), SoleProprietorship);
		codesByName.put(PublicLimitedCompany.getCodeName().get(), PublicLimitedCompany);
		codesByName.put(PrivateCompanyLimitedByShares.getCodeName().get(), PrivateCompanyLimitedByShares);
		codesByName.put(PrivateCompanyLimitedByGuarantee.getCodeName().get(), PrivateCompanyLimitedByGuarantee);
		codesByName.put(LimitedPartnership.getCodeName().get(), LimitedPartnership);
		codesByName.put(LimitedLiabilityPartnership.getCodeName().get(), LimitedLiabilityPartnership);
		codesByName.put(IndustrialAndProvidentSociety.getCodeName().get(), IndustrialAndProvidentSociety);
		codesByName.put(GeneralPartnership.getCodeName().get(), GeneralPartnership);
		codesByName.put(CommunityInterestCompany.getCodeName().get(), CommunityInterestCompany);
		codesByName.put(Charity.getCodeName().get(), Charity);
		codesByName.put(CharitableIncorporatedOrganisation.getCodeName().get(), CharitableIncorporatedOrganisation);
	}

	public static OrganisationLegalStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrganisationLegalStatusCode[] values() {
		OrganisationLegalStatusCode[] values = new OrganisationLegalStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrganisationLegalStatusCode> {
		@Override
		public OrganisationLegalStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrganisationLegalStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}