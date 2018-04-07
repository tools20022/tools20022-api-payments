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
import com.tools20022.repository.codeset.MeetingTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of security holders meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingTypeCode#AnnualGeneralMeeting
 * MeetingTypeCode.AnnualGeneralMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MeetingTypeCode#Ordinary
 * MeetingTypeCode.Ordinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingTypeCode#Extraordinary
 * MeetingTypeCode.Extraordinary}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MeetingTypeCode#Mixed
 * MeetingTypeCode.Mixed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingTypeCode#ClassMeeting
 * MeetingTypeCode.ClassMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingTypeCode#CourtMeeting
 * MeetingTypeCode.CourtMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MeetingTypeCode#Special
 * MeetingTypeCode.Special}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MeetingTypeCode#General
 * MeetingTypeCode.General}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingTypeCode#BondHolderMeeting
 * MeetingTypeCode.BondHolderMeeting}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AMET"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of security holders meeting."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MeetingTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies a meeting held periodically to approve the financial statements
	 * and elect the board members and the auditors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeCode
	 * MeetingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnualGeneralMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a meeting held periodically to approve the financial statements and elect the board members and the auditors."
	 * </li>
	 * </ul>
	 */
	public static final MeetingTypeCode AnnualGeneralMeeting = new MeetingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AnnualGeneralMeeting";
			definition = "Specifies a meeting held periodically to approve the financial statements and elect the board members and the auditors.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingTypeCode.mmObject();
			codeName = "AMET";
		}
	};
	/**
	 * Specifies a meeting that is not planned in the by laws.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeCode
	 * MeetingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ordinary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a meeting that is not planned in the by laws."</li>
	 * </ul>
	 */
	public static final MeetingTypeCode Ordinary = new MeetingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Ordinary";
			definition = "Specifies a meeting that is not planned in the by laws.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingTypeCode.mmObject();
			codeName = "OMET";
		}
	};
	/**
	 * Meeting that takes place as needed, in addition to the general meetings,
	 * is extraordinary as per the bylaws. The resolutions are related to the
	 * unusual business of the company, for example approval of takeovers or
	 * mergers or spin-offs. These meetings are always issuer initiated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeCode
	 * MeetingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extraordinary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meeting that takes place as needed, in addition to the general meetings, is extraordinary as per the bylaws. The resolutions are related to the unusual business of the company, for example approval of takeovers or mergers or spin-offs. These meetings are always issuer initiated."
	 * </li>
	 * </ul>
	 */
	public static final MeetingTypeCode Extraordinary = new MeetingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Extraordinary";
			definition = "Meeting that takes place as needed, in addition to the general meetings, is extraordinary as per the bylaws. The resolutions are related to the unusual business of the company, for example approval of takeovers or mergers or spin-offs. These meetings are always issuer initiated.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingTypeCode.mmObject();
			codeName = "XMET";
		}
	};
	/**
	 * Specifies a meeting which contains both ordinary and extraordinary
	 * resolutions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeCode
	 * MeetingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MIXD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mixed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a meeting which contains both ordinary and extraordinary resolutions."
	 * </li>
	 * </ul>
	 */
	public static final MeetingTypeCode Mixed = new MeetingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mixed";
			definition = "Specifies a meeting which contains both ordinary and extraordinary resolutions.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingTypeCode.mmObject();
			codeName = "MIXD";
		}
	};
	/**
	 * Meeting for a class of assets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeCode
	 * MeetingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting for a class of assets."</li>
	 * </ul>
	 */
	public static final MeetingTypeCode ClassMeeting = new MeetingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClassMeeting";
			definition = "Meeting for a class of assets.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingTypeCode.mmObject();
			codeName = "CLAS";
		}
	};
	/**
	 * Specifies that the meeting is the result of a legal proceeding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeCode
	 * MeetingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourtMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the meeting is the result of a legal proceeding."</li>
	 * </ul>
	 */
	public static final MeetingTypeCode CourtMeeting = new MeetingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CourtMeeting";
			definition = "Specifies that the meeting is the result of a legal proceeding.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingTypeCode.mmObject();
			codeName = "CORT";
		}
	};
	/**
	 * Meeting that takes place as needed that is neither ordinary nor
	 * extraordinary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeCode
	 * MeetingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Special"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meeting that takes place as needed that is neither ordinary nor extraordinary."
	 * </li>
	 * </ul>
	 */
	public static final MeetingTypeCode Special = new MeetingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Special";
			definition = "Meeting that takes place as needed that is neither ordinary nor extraordinary.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingTypeCode.mmObject();
			codeName = "SPCL";
		}
	};
	/**
	 * Includes annual and ordinary meeting. Statutory meeting(s) usually held
	 * at least once a year. The resolutions are related to the usual business
	 * of the company, for example approval of dividends, directors, etc. These
	 * meetings are always issuer initiated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeCode
	 * MeetingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "General"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Includes annual and ordinary meeting. Statutory meeting(s) usually held at least once a year. The resolutions are related to the usual business of the company, for example approval of dividends, directors, etc. These meetings are always issuer initiated."
	 * </li>
	 * </ul>
	 */
	public static final MeetingTypeCode General = new MeetingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "General";
			definition = "Includes annual and ordinary meeting. Statutory meeting(s) usually held at least once a year. The resolutions are related to the usual business of the company, for example approval of dividends, directors, etc. These meetings are always issuer initiated.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingTypeCode.mmObject();
			codeName = "GMET";
		}
	};
	/**
	 * Physical meeting of bond holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeCode
	 * MeetingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondHolderMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical meeting of bond holders."</li>
	 * </ul>
	 */
	public static final MeetingTypeCode BondHolderMeeting = new MeetingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondHolderMeeting";
			definition = "Physical meeting of bond holders.";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingTypeCode.mmObject();
			codeName = "BMET";
		}
	};
	final static private LinkedHashMap<String, MeetingTypeCode> codesByName = new LinkedHashMap<>();

	protected MeetingTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AMET");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingTypeCode";
				definition = "Specifies the type of security holders meeting.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MeetingTypeCode.AnnualGeneralMeeting, com.tools20022.repository.codeset.MeetingTypeCode.Ordinary,
						com.tools20022.repository.codeset.MeetingTypeCode.Extraordinary, com.tools20022.repository.codeset.MeetingTypeCode.Mixed, com.tools20022.repository.codeset.MeetingTypeCode.ClassMeeting,
						com.tools20022.repository.codeset.MeetingTypeCode.CourtMeeting, com.tools20022.repository.codeset.MeetingTypeCode.Special, com.tools20022.repository.codeset.MeetingTypeCode.General,
						com.tools20022.repository.codeset.MeetingTypeCode.BondHolderMeeting);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AnnualGeneralMeeting.getCodeName().get(), AnnualGeneralMeeting);
		codesByName.put(Ordinary.getCodeName().get(), Ordinary);
		codesByName.put(Extraordinary.getCodeName().get(), Extraordinary);
		codesByName.put(Mixed.getCodeName().get(), Mixed);
		codesByName.put(ClassMeeting.getCodeName().get(), ClassMeeting);
		codesByName.put(CourtMeeting.getCodeName().get(), CourtMeeting);
		codesByName.put(Special.getCodeName().get(), Special);
		codesByName.put(General.getCodeName().get(), General);
		codesByName.put(BondHolderMeeting.getCodeName().get(), BondHolderMeeting);
	}

	public static MeetingTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MeetingTypeCode[] values() {
		MeetingTypeCode[] values = new MeetingTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MeetingTypeCode> {
		@Override
		public MeetingTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MeetingTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}