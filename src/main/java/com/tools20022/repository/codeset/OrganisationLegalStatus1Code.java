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
import com.tools20022.repository.codeset.OrganisationLegalStatus1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code#CharitableIncorporatedOrganisation
 * OrganisationLegalStatus1Code.CharitableIncorporatedOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code#Charity
 * OrganisationLegalStatus1Code.Charity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code#CommunityInterestCompany
 * OrganisationLegalStatus1Code.CommunityInterestCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code#GeneralPartnership
 * OrganisationLegalStatus1Code.GeneralPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code#IndustrialAndProvidentSociety
 * OrganisationLegalStatus1Code.IndustrialAndProvidentSociety}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code#LimitedLiabilityPartnership
 * OrganisationLegalStatus1Code.LimitedLiabilityPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code#PrivateCompanyLimitedByGuarantee
 * OrganisationLegalStatus1Code.PrivateCompanyLimitedByGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code#LimitedPartnership
 * OrganisationLegalStatus1Code.LimitedPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code#PrivateCompanyLimitedByShares
 * OrganisationLegalStatus1Code.PrivateCompanyLimitedByShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code#PublicLimitedCompany
 * OrganisationLegalStatus1Code.PublicLimitedCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code#SoleProprietorship
 * OrganisationLegalStatus1Code.SoleProprietorship}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code#UnlimitedCompany
 * OrganisationLegalStatus1Code.UnlimitedCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code#UnlimitedTrust
 * OrganisationLegalStatus1Code.UnlimitedTrust}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatusCode
 * OrganisationLegalStatusCode}</li>
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
 * "OrganisationLegalStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a legal entity."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrganisationLegalStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code
	 * OrganisationLegalStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CharitableIncorporatedOrganisation"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatus1Code CharitableIncorporatedOrganisation = new OrganisationLegalStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CharitableIncorporatedOrganisation";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatus1Code.mmObject();
			codeName = OrganisationLegalStatusCode.CharitableIncorporatedOrganisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code
	 * OrganisationLegalStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charity"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatus1Code Charity = new OrganisationLegalStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charity";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatus1Code.mmObject();
			codeName = OrganisationLegalStatusCode.Charity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code
	 * OrganisationLegalStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommunityInterestCompany"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatus1Code CommunityInterestCompany = new OrganisationLegalStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommunityInterestCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatus1Code.mmObject();
			codeName = OrganisationLegalStatusCode.CommunityInterestCompany.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code
	 * OrganisationLegalStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneralPartnership"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatus1Code GeneralPartnership = new OrganisationLegalStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneralPartnership";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatus1Code.mmObject();
			codeName = OrganisationLegalStatusCode.GeneralPartnership.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code
	 * OrganisationLegalStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndustrialAndProvidentSociety"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatus1Code IndustrialAndProvidentSociety = new OrganisationLegalStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndustrialAndProvidentSociety";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatus1Code.mmObject();
			codeName = OrganisationLegalStatusCode.IndustrialAndProvidentSociety.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code
	 * OrganisationLegalStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedLiabilityPartnership"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatus1Code LimitedLiabilityPartnership = new OrganisationLegalStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedLiabilityPartnership";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatus1Code.mmObject();
			codeName = OrganisationLegalStatusCode.LimitedLiabilityPartnership.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code
	 * OrganisationLegalStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivateCompanyLimitedByGuarantee"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatus1Code PrivateCompanyLimitedByGuarantee = new OrganisationLegalStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivateCompanyLimitedByGuarantee";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatus1Code.mmObject();
			codeName = OrganisationLegalStatusCode.PrivateCompanyLimitedByGuarantee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code
	 * OrganisationLegalStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedPartnership"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatus1Code LimitedPartnership = new OrganisationLegalStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedPartnership";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatus1Code.mmObject();
			codeName = OrganisationLegalStatusCode.LimitedPartnership.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code
	 * OrganisationLegalStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivateCompanyLimitedByShares"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatus1Code PrivateCompanyLimitedByShares = new OrganisationLegalStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivateCompanyLimitedByShares";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatus1Code.mmObject();
			codeName = OrganisationLegalStatusCode.PrivateCompanyLimitedByShares.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code
	 * OrganisationLegalStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicLimitedCompany"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatus1Code PublicLimitedCompany = new OrganisationLegalStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicLimitedCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatus1Code.mmObject();
			codeName = OrganisationLegalStatusCode.PublicLimitedCompany.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code
	 * OrganisationLegalStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoleProprietorship"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatus1Code SoleProprietorship = new OrganisationLegalStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoleProprietorship";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatus1Code.mmObject();
			codeName = OrganisationLegalStatusCode.SoleProprietorship.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code
	 * OrganisationLegalStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnlimitedCompany"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatus1Code UnlimitedCompany = new OrganisationLegalStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnlimitedCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatus1Code.mmObject();
			codeName = OrganisationLegalStatusCode.UnlimitedCompany.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrganisationLegalStatus1Code
	 * OrganisationLegalStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnlimitedTrust"</li>
	 * </ul>
	 */
	public static final OrganisationLegalStatus1Code UnlimitedTrust = new OrganisationLegalStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnlimitedTrust";
			owner_lazy = () -> com.tools20022.repository.codeset.OrganisationLegalStatus1Code.mmObject();
			codeName = OrganisationLegalStatusCode.UnlimitedTrust.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OrganisationLegalStatus1Code> codesByName = new LinkedHashMap<>();

	protected OrganisationLegalStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "OrganisationLegalStatus1Code";
				definition = "Specifies the status of a legal entity.";
				trace_lazy = () -> OrganisationLegalStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrganisationLegalStatus1Code.CharitableIncorporatedOrganisation, com.tools20022.repository.codeset.OrganisationLegalStatus1Code.Charity,
						com.tools20022.repository.codeset.OrganisationLegalStatus1Code.CommunityInterestCompany, com.tools20022.repository.codeset.OrganisationLegalStatus1Code.GeneralPartnership,
						com.tools20022.repository.codeset.OrganisationLegalStatus1Code.IndustrialAndProvidentSociety, com.tools20022.repository.codeset.OrganisationLegalStatus1Code.LimitedLiabilityPartnership,
						com.tools20022.repository.codeset.OrganisationLegalStatus1Code.PrivateCompanyLimitedByGuarantee, com.tools20022.repository.codeset.OrganisationLegalStatus1Code.LimitedPartnership,
						com.tools20022.repository.codeset.OrganisationLegalStatus1Code.PrivateCompanyLimitedByShares, com.tools20022.repository.codeset.OrganisationLegalStatus1Code.PublicLimitedCompany,
						com.tools20022.repository.codeset.OrganisationLegalStatus1Code.SoleProprietorship, com.tools20022.repository.codeset.OrganisationLegalStatus1Code.UnlimitedCompany,
						com.tools20022.repository.codeset.OrganisationLegalStatus1Code.UnlimitedTrust);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CharitableIncorporatedOrganisation.getCodeName().get(), CharitableIncorporatedOrganisation);
		codesByName.put(Charity.getCodeName().get(), Charity);
		codesByName.put(CommunityInterestCompany.getCodeName().get(), CommunityInterestCompany);
		codesByName.put(GeneralPartnership.getCodeName().get(), GeneralPartnership);
		codesByName.put(IndustrialAndProvidentSociety.getCodeName().get(), IndustrialAndProvidentSociety);
		codesByName.put(LimitedLiabilityPartnership.getCodeName().get(), LimitedLiabilityPartnership);
		codesByName.put(PrivateCompanyLimitedByGuarantee.getCodeName().get(), PrivateCompanyLimitedByGuarantee);
		codesByName.put(LimitedPartnership.getCodeName().get(), LimitedPartnership);
		codesByName.put(PrivateCompanyLimitedByShares.getCodeName().get(), PrivateCompanyLimitedByShares);
		codesByName.put(PublicLimitedCompany.getCodeName().get(), PublicLimitedCompany);
		codesByName.put(SoleProprietorship.getCodeName().get(), SoleProprietorship);
		codesByName.put(UnlimitedCompany.getCodeName().get(), UnlimitedCompany);
		codesByName.put(UnlimitedTrust.getCodeName().get(), UnlimitedTrust);
	}

	public static OrganisationLegalStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrganisationLegalStatus1Code[] values() {
		OrganisationLegalStatus1Code[] values = new OrganisationLegalStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrganisationLegalStatus1Code> {
		@Override
		public OrganisationLegalStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrganisationLegalStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}